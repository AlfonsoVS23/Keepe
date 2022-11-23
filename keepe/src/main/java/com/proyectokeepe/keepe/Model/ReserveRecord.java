package com.proyectokeepe.keepe.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

// HISTORIAL RESERVA
@Entity(name = "ReserveRecord")
public class ReserveRecord {
    @Id
    @GeneratedValue
    private Integer id;
    private Date reserveRecordDate;
    private String review;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
