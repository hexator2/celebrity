package com.bluff.celebrytalk.domain.auth;

import com.bluff.celebrytalk.domain.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Auth extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "auth_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
