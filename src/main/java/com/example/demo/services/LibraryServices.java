package com.example.demo.services;

import com.example.demo.controller.Library;
import com.example.demo.repository.LibraryRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryServices {
    @Autowired
    LibraryRepository libraryRepository;
    public Library createUser(Library user){
        return libraryRepository.save(user);
    }
    public Library getUser(int id){
        return libraryRepository.findById(id).orElse(null);
    }
    public Library updateUser(Library user){
        Optional<Library> userFound=libraryRepository.findById(user.getPersonID());
        if(userFound.isPresent()){
            Library userUpdate=userFound.get();
            userUpdate.setCity(user.getCity());
            userUpdate.setFirstName(user.getFirstName());
            userUpdate.setAddress(user.getAddress());
            userUpdate.setPersonID(user.getPersonID());
            userUpdate.setLastName(user.getLastName());
            return libraryRepository.save(user);
        }else {
            return null;
        }
    }
    public String deleteUser(int id){
        libraryRepository.deleteById(id);
        return "User "+id+ " Deleted";
    }
}
