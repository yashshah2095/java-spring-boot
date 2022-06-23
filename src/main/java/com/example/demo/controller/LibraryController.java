package com.example.demo.controller;

import com.example.demo.services.LibraryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class LibraryController {
    @Autowired
    LibraryServices libraryServices;
    @GetMapping("/user/{id}")
    public ResponseEntity<Library> getUser(@PathVariable int id){
        return ResponseEntity.ok().body(libraryServices.getUser(id));
    }
    @PostMapping("/addUser")
    public ResponseEntity<Library> addUser(@RequestBody Library user){
        return ResponseEntity.ok(libraryServices.createUser(user));
    }
    @PatchMapping("/updateUser")
    public ResponseEntity<Library> updateUser(@RequestBody Library user){
        return ResponseEntity.ok(libraryServices.updateUser(user));
    }
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return libraryServices.deleteUser(id);
    }
}
