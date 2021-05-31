package com.bluff.celebrytalk.domain.manager;

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
    name="manager_ip_address",
    indexes = {
        @Index(columnList = "manager_id")
    })
public class ManagerIpAddress extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id_address_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @Column(name = "ip_address", length = 50)
    private String ipAddress;

    @Column(name = "admin_id", length = 50)
    private String adminId;

    @Column(name = "admin_name", length = 30)
    private String adminName;

}
