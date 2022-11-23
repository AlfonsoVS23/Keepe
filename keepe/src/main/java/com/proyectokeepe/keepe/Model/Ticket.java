package com.proyectokeepe.keepe.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
// TICKET RESERVA
@Entity(name = "Ticket")
public class Ticket {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer placeNumber;
    @Column(name = "qrCode", unique = true)
    private String qrCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reserveDate;
    @DateTimeFormat(pattern = "HH:mm")
    private Date startTime;
    @DateTimeFormat(pattern = "HH:mm")
    private Date endTime;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<User> user;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ReserveRecord> reserveRecord;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Place> place;

}
