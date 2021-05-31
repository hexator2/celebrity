package com.bluff.celebrytalk.domain.push;

import com.bluff.celebrytalk.domain.BaseEntity;
import com.bluff.celebrytalk.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
    name = "push_log",
    indexes = {
        @Index(columnList = "user_id"),
        @Index(columnList = "sender"),
        @Index(columnList = "device_kind"),
        @Index(columnList = "send_type"),
        @Index(columnList = "send_result"),
        @Index(columnList = "send_date"),
        @Index(columnList = "send_proc_id")
    })
public class PushLog extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "push_log_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "device_kind", length = 50, nullable = false)
    private String deviceKind;

    @Column(name = "registration_key", nullable = false)
    private String registrationKey;

    @Column(name = "api_push_key", nullable = false)
    private String apiPushKey;

    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "text")
    private String message;

    private String content;

    @Column(length = 50)
    private String sound;

    @Column(length = 50)
    private String action;

    private String link;

    @Column(length = 50, nullable = false)
    private String sender;

    @Column(name = "send_type", length = 10)
    @ColumnDefault("'reserve'")
    private String sendType;

    @Column(name = "send_date")
    private Timestamp sendDate;

    @Column(name = "send_proc_id", length = 20)
    private String sendProcId;

    @Column(name="send_result", length = 1)
    @ColumnDefault("0")
    private int sendResult;

    @Column(name="send_result_message")
    private String sendResultMessage;
}
