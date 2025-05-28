package com.example.cash_deposit.customer;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerRequestDTO {
    private String gender;
    private String lastName;
    private String kycStatus;
    private String firstName;
    private String middleName;
    private String nationality;
    private LocalDate dateOfBirth;
    private String nationalIdNumber;

    private String passwordHash;
    private LocalDateTime lastLogin;
    private boolean twoFactorEnabled;

    private String riskRating;
    private LocalDate kycReviewDate;
    private boolean sanctionsCheckPassed;
    private boolean politicallyExposedPerson;

    private String city;
    private String email;
    private String state;
    private String country;
    private String postalCode;
    private String phoneNumber;
    private String addressLine1;
    private String addressLine2;
    private String alternatePhone;

    private String documentUrl;
    private String idDocumentType;
    private String idDocumentNumber;
    private LocalDate documentExpiryDate;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalIdNumber() {
        return nationalIdNumber;
    }

    public void setNationalIdNumber(String nationalIdNumber) {
        this.nationalIdNumber = nationalIdNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public String getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(String riskRating) {
        this.riskRating = riskRating;
    }

    public LocalDate getKycReviewDate() {
        return kycReviewDate;
    }

    public void setKycReviewDate(LocalDate kycReviewDate) {
        this.kycReviewDate = kycReviewDate;
    }

    public boolean isSanctionsCheckPassed() {
        return sanctionsCheckPassed;
    }

    public void setSanctionsCheckPassed(boolean sanctionsCheckPassed) {
        this.sanctionsCheckPassed = sanctionsCheckPassed;
    }

    public boolean isPoliticallyExposedPerson() {
        return politicallyExposedPerson;
    }

    public void setPoliticallyExposedPerson(boolean politicallyExposedPerson) {
        this.politicallyExposedPerson = politicallyExposedPerson;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAlternatePhone() {
        return alternatePhone;
    }

    public void setAlternatePhone(String alternatePhone) {
        this.alternatePhone = alternatePhone;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(String idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public String getIdDocumentNumber() {
        return idDocumentNumber;
    }

    public void setIdDocumentNumber(String idDocumentNumber) {
        this.idDocumentNumber = idDocumentNumber;
    }

    public LocalDate getDocumentExpiryDate() {
        return documentExpiryDate;
    }

    public void setDocumentExpiryDate(LocalDate documentExpiryDate) {
        this.documentExpiryDate = documentExpiryDate;
    }
}
