package com.bluff.celebrytalk.domain.celebration;

import com.bluff.celebrytalk.domain.BaseEntity;
import com.bluff.celebrytalk.domain.user.User;
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
    name = "celebration_reply",
    indexes = {
        @Index(columnList = "user_id"),
        @Index(columnList = "celebration_id")
    })
public class CelebrationReply extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "celebration_reply_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "celebration_id")
    private Celebration celebration;

    private String message;

    @Column(name = "is_push", length = 1)
    @ColumnDefault("0")
    private Short isPush;

    @Column(name = "is_active", length = 1)
    @ColumnDefault("1")
    private Short isActive;

}
