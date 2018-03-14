package com.jpahibernate.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by yangjing on 2018/3/14
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Spitter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FULLNAME")
    private String fullname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "UPDATE_BY_EMAIL")
    private String updateByEmail;

    public Spitter(String username, String password, String fullname, String email, String updateByEmail) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.updateByEmail = updateByEmail;
    }
}
