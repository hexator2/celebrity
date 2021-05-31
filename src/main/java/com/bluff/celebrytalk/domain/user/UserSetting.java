package com.bluff.celebrytalk.domain.user;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "user_setting")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserSetting extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_setting_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "alarm_yn", length = 1, nullable = false)
    @ColumnDefault("'Y'")
    private String alarmYN;

    @Column(name = "ad_yn", length = 1, nullable = false)
    @ColumnDefault("'Y'")
    private String adYN;

    @Column(name = "agree_privacy_msg", length = 1)
    @ColumnDefault("0")
    private Short agreePrivacyMsg;

    @Column(name = "agree_celebrity_msg", length = 1)
    @ColumnDefault("0")
    private Short agreeCelebryMsg;
}
