package com.bluff.celebrytalk.domain.celebration;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    indexes = {
        @Index(columnList = "type")
    },
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"type", "word"})
    })
public class Word extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private Long categoryParentId;

    private String type;

    private String word;

    @Column(name = "is_active", length = 1)
    @ColumnDefault("1")
    private Short isActive;
}
