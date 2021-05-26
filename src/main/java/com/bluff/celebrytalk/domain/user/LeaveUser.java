package com.bluff.celebrytalk.domain.user;

import com.bluff.celebrytalk.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "leave_user")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LeaveUser extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "leave_user_id")
    private Long id;
}
