package com.bluff.celebrytalk.domain.push;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "push_send")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PushSend extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "push_send")
    private Long id;
}
