package com.bluff.celebrytalk.domain.auth;

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
public class InitAppInfo extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "init_app_info_id")
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "device_uuid")
    private String deviceUUID;

    @Column(name = "device_kind", length = 50)
    private String deviceKind;

    @Column(name = "device_model")
    private String deviceModel;

    @Column(name = "registration_key")
    private String registrationKey;

    @Column(name = "api_end_point")
    private String apiEndPoint;

    @Column(name = "app_version", length = 50)
    private String lastAppVersion;

    @Column(name = "is_active", length = 1)
    @ColumnDefault("1")
    private Short isActive;


}
