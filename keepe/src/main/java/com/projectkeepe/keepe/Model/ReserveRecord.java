package com.projectkeepe.keepe.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "reserverecord")
public class ReserveRecord {
     @Id
     @GeneratedValue
     private Integer id;
     private Date reserveRecordDate;
     private String review; 

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    
    @OneToMany(mappedBy = "reserverecord", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ticket> ticket;


    public ReserveRecord() {
    }


    public ReserveRecord(Integer id, Date reserveRecordDate, String review, User user, List<Ticket> ticket) {
        this.id = id;
        this.reserveRecordDate = reserveRecordDate;
        this.review = review;
        this.user = user;
        this.ticket = ticket;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Date getReserveRecordDate() {
        return reserveRecordDate;
    }


    public void setReserveRecordDate(Date reserveRecordDate) {
        this.reserveRecordDate = reserveRecordDate;
    }


    public String getReview() {
        return review;
    }


    public void setReview(String review) {
        this.review = review;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public List<Ticket> getTicket() {
        return ticket;
    }


    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }


    

  

}

