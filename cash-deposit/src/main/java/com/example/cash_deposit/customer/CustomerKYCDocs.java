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
    private Long id;
    private Customer customer;
    private String documentUrl; // if scanned ID is uploaded
    private String idDocumentType; // e.g., PASSPORT, NATIONAL_ID
    private String idDocumentNumber;    
    private LocalDate documentExpiryDate;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomerKYCDocs(Customer customer, String documentUrl, String idDocumentType, String idDocumentNumber, LocalDate documentExpiryDate) {
        this.customer = customer;
        this.documentUrl = documentUrl;
        this.idDocumentType = idDocumentType;
        this.idDocumentNumber = idDocumentNumber;
        this.documentExpiryDate = documentExpiryDate;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Customer getCustomer() {return customer;}
    public void setCustomer(Customer customer) {this.customer = customer;}

    public String getDocumentUrl() {return documentUrl;}
    public void setDocumentUrl(String documentUrl) {this.documentUrl = documentUrl;}

    public String getIdDocumentType() {return idDocumentType;}
    public void setIdDocumentType(String idDocumentType) {this.idDocumentType = idDocumentType;}

    public String getIdDocumentNumber() {return idDocumentNumber;}
    public void setIdDocumentNumber(String idDocumentNumber) {this.idDocumentNumber = idDocumentNumber;}

    public LocalDate getDocumentExpiryDate() {return documentExpiryDate;}
    public void setDocumentExpiryDate(LocalDate documentExpiryDate) {this.documentExpiryDate = documentExpiryDate;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

    public LocalDateTime getUpdatedAt() {return updatedAt;}
    public void setUpdatedAt(LocalDateTime updatedAt) {this.updatedAt = updatedAt;}
}
