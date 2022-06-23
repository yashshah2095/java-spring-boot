package com.example.demo.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Library {
    @Id
    @Column(name = "personID")
    private Integer personID;
    @Column(name = "LastName")
    private String LastName;
    @Column(name = "FirstName")
    private String FirstName;
    @Column(name = "Address")
    private String Address;
    @Column(name = "City")
    private String City;

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        System.out.println(firstName+" Hello");
        FirstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
