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
    private String username;
    private Customer customer;
    private String passwordHash;
    private LocalDateTime lastLogin;
    private boolean twoFactorEnabled;    
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
