package com.bluff.celebrity.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Admin {
    @Id
    @Column(name="id")
    @GeneratedValue
    Long id;

    @Column(name="name")
    String name;

    public Admin(String name) {
        this.name = name;
    }

}
