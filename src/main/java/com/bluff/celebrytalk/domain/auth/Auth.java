package com.bluff.celebrytalk.domain.auth;

import com.bluff.celebrytalk.domain.*;

import com.bluff.celebrytalk.domain.user.User;
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
        @Index(columnList = "is_hibernated")
    })
public class Auth extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String password;

    @Column(name = "api_end_point")
    private String apiEndPoint;

    @Column(name = "is_active", length = 1)
    @ColumnDefault("1")
    private Short isActive;

    @Column(name = "ban_date")
    private Timestamp banDate;

    @Column(name = "leave_date")
    private Timestamp leaveDate;

    @Column(name = "leave_req_date")
    private Timestamp leaveReqDate;

    @Column(name = "join_date")
    private Timestamp joinDate;

    @Column(name = "last_login_date")
    private Timestamp lastLoginDate;

    @Column(name = "is_hibernated", length = 1)
    @ColumnDefault("0")
    private Short isHibernated;

    /* relation table */
    @OneToOne(mappedBy = "auth", fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
