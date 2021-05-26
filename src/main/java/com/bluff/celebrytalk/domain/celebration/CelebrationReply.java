package com.bluff.celebrytalk.domain.celebration;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "celebration_reply")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CelebrationReply extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "celebration_reply_id")
    private Long id;
}
