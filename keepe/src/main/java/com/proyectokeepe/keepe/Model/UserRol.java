package com.proyectokeepe.keepe.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// ROL USUARIO

@Entity(name = "UserRol")
public class UserRol {
    @Id
    @GeneratedValue
    private Integer id;
    private String rolType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}