/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cash_deposit.customer;

import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class CustomerContact {   
    private Long id;
    private String city;
    private String email;
    private String state;
    private String country;
    private Customer customer;
    private String postalCode;
    private String phoneNumber;
    private String addressLine1;
    private String addressLine2;    
    private String alternatePhone;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomerContact(String city, String email, String state, String country, Customer customer, String postalCode, String phoneNumber, String addressLine1, String addressLine2, String alternatePhone) {
        this.city = city;
        this.email = email;
        this.state = state;
        this.country = country;
        this.customer = customer;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.alternatePhone = alternatePhone;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getState() {return state;}
    public void setState(String state) {this.state = state;}

    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}

    public Customer getCustomer() {return customer;}
    public void setCustomer(Customer customer) {this.customer = customer;}

    public String getPostalCode() {return postalCode;}
    public void setPostalCode(String postalCode) {this.postalCode = postalCode;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getAddressLine1() {return addressLine1;}
    public void setAddressLine1(String addressLine1) {this.addressLine1 = addressLine1;}

    public String getAddressLine2() {return addressLine2;}
    public void setAddressLine2(String addressLine2) {this.addressLine2 = addressLine2;}
    
    public String getAlternatePhone() {return alternatePhone;}
    public void setAlternatePhone(String alternatePhone) {this.alternatePhone = alternatePhone;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

    public LocalDateTime getUpdatedAt() {return updatedAt;}
    public void setUpdatedAt(LocalDateTime updatedAt) {this.updatedAt = updatedAt;}
    
    
    
}
