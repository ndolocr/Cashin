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
public class CustomerKYCDocs {
    private Customer customer;
    private String documentUrl; // if scanned ID is uploaded
    private String idDocumentType; // e.g., PASSPORT, NATIONAL_ID
    private String idDocumentNumber;    
    private LocalDate documentExpiryDate;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
