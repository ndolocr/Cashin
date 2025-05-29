/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cash_deposit.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author user
 */

@Entity
@Table(name = "customer_compliance_info")
public class CustomerComplianceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @Column(nullable = true)
    private String riskRating; // e.g., LOW, MEDIUM, HIGH

    @Column(nullable = true)
    private LocalDate kycReviewDate;

    @Column(nullable = true)
    private boolean sanctionsCheckPassed;

    @Column(nullable = true)
    private boolean politicallyExposedPerson;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomerComplianceInfo(CustomerEntity customer, String riskRating, LocalDate kycReviewDate, boolean sanctionsCheckPassed, boolean politicallyExposedPerson) {
        this.customer = customer;
        this.riskRating = riskRating;
        this.kycReviewDate = kycReviewDate;
        this.sanctionsCheckPassed = sanctionsCheckPassed;
        this.politicallyExposedPerson = politicallyExposedPerson;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public CustomerEntity getCustomer() {return customer;}
    public void setCustomer(CustomerEntity customer) {this.customer = customer;}

    public String getRiskRating() {return riskRating;}
    public void setRiskRating(String riskRating) {this.riskRating = riskRating;}

    public LocalDate getKycReviewDate() {return kycReviewDate;}
    public void setKycReviewDate(LocalDate kycReviewDate) {this.kycReviewDate = kycReviewDate;}

    public boolean isSanctionsCheckPassed() {return sanctionsCheckPassed;}
    public void setSanctionsCheckPassed(boolean sanctionsCheckPassed) {this.sanctionsCheckPassed = sanctionsCheckPassed;}

    public boolean isPoliticallyExposedPerson() {return politicallyExposedPerson;}
    public void setPoliticallyExposedPerson(boolean politicallyExposedPerson) {this.politicallyExposedPerson = politicallyExposedPerson;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

    public LocalDateTime getUpdatedAt() {return updatedAt;}
    public void setUpdatedAt(LocalDateTime updatedAt) {this.updatedAt = updatedAt;}
}
