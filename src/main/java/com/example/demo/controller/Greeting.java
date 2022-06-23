package com.example.demo.controller;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class Greeting {
    private AtomicLong id;
    private String name;

    public AtomicLong getId() {
        return id;
    }

    public void setId(AtomicLong id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
