package com.proyectokeepe.keepe.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

// USUARIO
@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "fullname", unique = true)
    private String fullname;
    private String password;
    @Column(name = "email", unique = true)
    private String correo;
    @Column(name = "rut", unique = true)
    private String rut;
    @Column(name = "phonenumber", unique = true)
    private int phonenumber;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ReserveRecord reserveRecord;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UserRol> userRol;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;


}






