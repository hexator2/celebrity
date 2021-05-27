package com.bluff.celebrytalk.domain.auth;

import com.bluff.celebrytalk.domain.BaseEntity;
import com.bluff.celebrytalk.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InitAppInfo extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "init_app_info_id")
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
