package com.bluff.celebrytalk.domain.manager;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="manager_status")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ManagerStatus extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "manager_status_id")
    private Long id;
}
