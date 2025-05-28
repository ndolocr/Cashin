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
public class CustomerAuth {
    private Long id;
    private String username;
    private Customer customer;
    private String passwordHash;
    private LocalDateTime lastLogin;
    private boolean twoFactorEnabled;    
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomerAuth(String username, Customer customer, String passwordHash, LocalDateTime lastLogin, boolean twoFactorEnabled) {
        this.username = username;
        this.customer = customer;
        this.passwordHash = passwordHash;
        this.lastLogin = lastLogin;
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public Customer getCustomer() {return customer;}
    public void setCustomer(Customer customer) {this.customer = customer;}

    public String getPasswordHash() {return passwordHash;}
    public void setPasswordHash(String passwordHash) {this.passwordHash = passwordHash;}

    public LocalDateTime getLastLogin() {return lastLogin;}
    public void setLastLogin(LocalDateTime lastLogin) {this.lastLogin = lastLogin;}

    public boolean isTwoFactorEnabled() {return twoFactorEnabled;}
    public void setTwoFactorEnabled(boolean twoFactorEnabled) {this.twoFactorEnabled = twoFactorEnabled;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

    public LocalDateTime getUpdatedAt() {return updatedAt;}
    public void setUpdatedAt(LocalDateTime updatedAt) {this.updatedAt = updatedAt;}
    
    
}
