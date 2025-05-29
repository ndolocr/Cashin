/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cash_deposit.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 *
 * @author user
 */
@Entity
@Table(name = "customer_auth")
public class CustomerAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = true)
    private LocalDateTime lastLogin;

    @Column(nullable = true)
    private boolean twoFactorEnabled;    
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomerAuth(CustomerEntity customerEntity, String passwordHash, LocalDateTime lastLogin, boolean twoFactorEnabled) {
        this.customer = customerEntity;
        this.passwordHash = passwordHash;
        this.lastLogin = lastLogin;
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public CustomerEntity getCustomer() {return customer;}
    public void setCustomer(CustomerEntity customerEntity) {this.customer = customerEntity;}

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
