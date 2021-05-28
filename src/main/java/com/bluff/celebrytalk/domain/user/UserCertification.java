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
    name = "user_certification",
    indexes = {
        @Index(columnList = "user_id")
    },
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"cert_num"}),
        @UniqueConstraint(columnNames = {"user_id", "ci"})
    })
public class UserCertification extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_certification_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "cert_num", length = 40)
    private String certNum;

    @Column(length = 200)
    private String ci;

    @Column(length = 200)
    private String di;

}
