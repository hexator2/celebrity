package com.bluff.celebrytalk.domain.user;

import com.bluff.celebrytalk.domain.BaseEntity;
import com.bluff.celebrytalk.domain.auth.Auth;
import com.bluff.celebrytalk.domain.celebration.Celebration;
import com.bluff.celebrytalk.domain.celebration.CelebrationReply;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "user",
    indexes = {
        @Index(columnList = "user_status_code"),
        @Index(columnList = "nick"),
        @Index(columnList = "email")
    },
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"auth_id"})
    })
public class User extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "auth_id")
    private Auth auth;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "user_status_code", referencedColumnName  = "code")
    private UserStatus userStatusCode;

    @Column(name = "register_source_code", length = 50, nullable = false)
    @ColumnDefault("'CELEBRY_TALK'")
    private String registerSourceCode;

    @Column(length = 100, nullable = false)
    private String nick;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String phone;

    @Column(length = 50)
    private String gender;

    @Column(length = 50)
    private String grade;

    @Column(name = "zip_code", length = 20)
    private String zipCode;

    @Lob
    private String address;

    @Column(name = "address_detail")
    private String addressDetail;

    @Column(name = "birth_date", length = 8)
    private String birthDate;
}
