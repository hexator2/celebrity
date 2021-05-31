package com.bluff.celebrytalk.domain.manager;

import com.bluff.celebrytalk.domain.BaseEntity;
import com.bluff.celebrytalk.domain.auth.Auth;
import com.bluff.celebrytalk.domain.user.UserStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    indexes = {
        @Index(columnList = "auth_id")
    },
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"email"}),
        @UniqueConstraint(columnNames = {"login_id"}),
        @UniqueConstraint(columnNames = {"email", "login_id"})
    })
public class Manager extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "auth_id")
    private Auth auth;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "manager_status_code", referencedColumnName  = "code")
    private UserStatus managerStatusCode;

    @Column(name = "login_id", length = 50, nullable = false)
    private String loginId;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 50)
    private String nick;

    private String email;

    @Column(name = "is_ip_address", length = 5, nullable = false)
    @ColumnDefault("'N'")
    private String isIpAddress;

    @Column(name = "block_yn", length = 5, nullable = false)
    @ColumnDefault("'N'")
    private String blockYN;

    @Column(name = "login_fail_cnt", length = 1, nullable = false)
    @ColumnDefault("0")
    private Short loginFailCnt;

    @Column(name = "last_fail_date")
    private Timestamp lastFailDate;

    @Column(name = "admin_id", length = 50)
    private String adminId;

    @Column(name = "admin_name", length = 30)
    private String adminName;
}
