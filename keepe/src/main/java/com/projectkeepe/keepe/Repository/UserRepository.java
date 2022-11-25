package com.projectkeepe.keepe.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectkeepe.keepe.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    @Query(value = "SELECT * FROM User WHERE userName = ?1", nativeQuery = true)
    List <User> findAllUserUserName (String user); 

    @Query (value = "SELECT * FROM User WHERE correo = ?1", nativeQuery = true)
    List<User> findAllUserCorreo (String correo);

    @Query (value = "SELECT * FROM User WHERE fullName = ?1", nativeQuery = true)
    List<User> findAllUserFullName (String fullName);

    @Query (value = "SELECT * FROM User WHERE rut = ?1", nativeQuery = true)
    List<User> findAllUserRut (String rut);
}
