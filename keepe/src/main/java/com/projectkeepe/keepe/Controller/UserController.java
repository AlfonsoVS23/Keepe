package com.projectkeepe.keepe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectkeepe.keepe.Model.User;
import com.projectkeepe.keepe.Service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {

    private UserService userService;

    public UserController (@Autowired UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/findAll")
    public List<User>getUserAll(){
        return userService.findAll();
    }

    @PostMapping("/user")
    public void newUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @PutMapping("/user")
    public void updatUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void eliminarUser(@PathVariable Integer id){
        userService.eliminarUser(id);
    }
}
