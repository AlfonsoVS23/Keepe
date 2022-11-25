package com.projectkeepe.keepe.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.projectkeepe.keepe.Model.User;
import com.projectkeepe.keepe.Repository.UserRepository;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void updateUser (User user){
        userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> buscarPorRut(String rut){
        return userRepository.findAllUserRut(rut);
    }

    public void eliminarUser (Integer id){
        userRepository.deleteById(id);
    }
    
}
