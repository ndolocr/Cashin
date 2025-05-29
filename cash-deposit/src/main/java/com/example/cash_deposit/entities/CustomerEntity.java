/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cash_deposit.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.*;


/**
 *
 * @author user
 */

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String gender; // Could also be an enum

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String kycStatus; // e.g., VERIFIED, PENDING, REJECTED

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String middleName;

    @Column(nullable = false)
    private String nationality;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String nationalIdNumber; // e.g., ID/Passport Number    
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CustomerEntity(String gender, String lastName, String kycStatus, String firstName, String middleName, String nationality, LocalDate dateOfBirth, String nationalIdNumber) {
        this.gender = gender;
        this.lastName = lastName;
        this.kycStatus = kycStatus;
        this.firstName = firstName;
        this.middleName = middleName;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.nationalIdNumber = nationalIdNumber;
    }
    
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getKycStatus() {return kycStatus;}
    public void setKycStatus(String kycStatus) {this.kycStatus = kycStatus;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getMiddleName() {return middleName;}
    public void setMiddleName(String middleName) {this.middleName = middleName;}

    public String getNationality() {return nationality;}
    public void setNationality(String nationality) {this.nationality = nationality;}

    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public String getNationalIdNumber() {return nationalIdNumber;}
    public void setNationalIdNumber(String nationalIdNumber) {this.nationalIdNumber = nationalIdNumber;}

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

    public LocalDateTime getUpdatedAt() {return updatedAt;}
    public void setUpdatedAt(LocalDateTime updatedAt) {this.updatedAt = updatedAt;}
    
    
}
