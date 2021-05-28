package com.bluff.celebrytalk.domain.system;

import com.bluff.celebrytalk.domain.BaseEntity;
import com.bluff.celebrytalk.domain.manager.Manager;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    indexes = {
        @Index(columnList = "word")
    })
public class Slang extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "slang_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @Column(name = "is_active", length = 1)
    private Short isActive;

    @Column(length = 100)
    private String word;
}
