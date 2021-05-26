package com.bluff.celebrytalk.domain.system;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "firebase_log")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FirebaseLog extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "firebase_log_id")
    private Long id;
}
