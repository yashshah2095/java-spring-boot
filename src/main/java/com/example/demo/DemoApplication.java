package com.example.demo;

import com.example.demo.controller.Library;
import com.example.demo.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	LibraryRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String[] args){
		Optional<Library> lib=repository.findById(1);
		System.out.println();
	}
}
