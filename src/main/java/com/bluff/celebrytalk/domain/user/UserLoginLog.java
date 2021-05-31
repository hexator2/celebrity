package com.bluff.celebrytalk.domain.user;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "user_login_log",
    indexes = {
        @Index(columnList = "user_id"),
        @Index(columnList = "result"),
        @Index(columnList = "user_id, result")
    })
public class UserLoginLog extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_login_log_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private Short result;

    private String message;

    @Column(name = "ip_address", length = 50)
    private String ipAddress;
}
