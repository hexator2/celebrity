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
        @Index(columnList = "depth")
    },
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"type", "name"})
    })
public class Category extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    private String name;

    private String type;

    private Long depth;

    private Long parent;

    @Column(name = "is_active", length = 1)
    @ColumnDefault("1")
    private Short isActive;
}
