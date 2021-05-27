package com.bluff.celebrytalk.domain.push;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "push_send")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PushSend extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "push_send")
    private Long id;
}
