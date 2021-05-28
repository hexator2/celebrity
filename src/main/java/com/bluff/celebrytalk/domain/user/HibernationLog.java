package com.bluff.celebrytalk.domain.user;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "hibernation_log",
    indexes = {
        @Index(columnList = "user_id"),
        @Index(columnList = "acted_by")
    })
public class HibernationLog extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hibernation_log_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "is_hibernated", length = 1)
    private Short isHibernated;

    private String message;

    @Column(name = "acted_by")
    private Long actedBy;

}
