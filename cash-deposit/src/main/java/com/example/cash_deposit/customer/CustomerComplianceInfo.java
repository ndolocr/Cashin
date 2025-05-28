/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cash_deposit.customer;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author user
 */
public class CustomerComplianceInfo {
    private Customer customer;
    private String riskRating; // e.g., LOW, MEDIUM, HIGH
    private LocalDate kycReviewDate;
    private boolean sanctionsCheckPassed;
    private boolean politicallyExposedPerson;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
