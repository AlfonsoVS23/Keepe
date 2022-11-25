package com.projectkeepe.keepe.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "roluser")
public class RolUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String rolType; 
    
    @OneToMany(mappedBy = "roluser", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<User> User;

    public RolUser() {
    }

    public RolUser(Integer id, String rolType, List<com.projectkeepe.keepe.Model.User> user) {
        this.id = id;
        this.rolType = rolType;
        User = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolType() {
        return rolType;
    }

    public void setRolType(String rolType) {
        this.rolType = rolType;
    }

    public List<User> getUser() {
        return User;
    }

    public void setUser(List<User> user) {
        User = user;
    }

    

    
}
