package com.bluff.celebrytalk.domain.system;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "system_conf",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"type"}),
        @UniqueConstraint(columnNames = {"name"})
    })
public class SystemConf extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "system_conf_id")
    private Long id;

    @Column(length = 50)
    private String type;

    @Column(length = 50)
    private String name;

    @Column(length = 100)
    private String value;

    private String description;

    @Column(name = "manager_id", length = 50)
    private String managerId;

    @Column(name = "manager_name", length = 30)
    private String managerName;
}
