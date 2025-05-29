/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cash_deposit.controller;

import com.example.cash_deposit.entities.CustomerAuth;
import com.example.cash_deposit.entities.CustomerEntity;
import com.example.cash_deposit.models.CustomerRequestDTO;
import com.example.cash_deposit.repositories.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepository customerRepository;

    @PostMapping("/")
    public ResponseEntity<String> postCustomerDetails(@RequestBody CustomerRequestDTO customerRequestDTO){

        String gender = customerRequestDTO.getGender();
        String lastName = customerRequestDTO.getLastName();
        String kycStatus = customerRequestDTO.getKycStatus();
        String firstName = customerRequestDTO.getFirstName();
        String middleName = customerRequestDTO.getMiddleName();
        String nationality = customerRequestDTO.getNationality();
        LocalDate dateOfBirth = customerRequestDTO.getDateOfBirth();
        String nationalIdNumber = customerRequestDTO.getNationalIdNumber();

        CustomerEntity customerEntity = new CustomerEntity(gender, lastName, kycStatus, firstName, middleName, nationality, dateOfBirth, nationalIdNumber);
        customerRepository.save(customerEntity);

        String passwordHash = customerRequestDTO.getPasswordHash();
        LocalDateTime lastLogin = customerRequestDTO.getLastLogin();
        boolean twoFactorEnabled = customerRequestDTO.isTwoFactorEnabled();

        CustomerAuth customerAuth = new CustomerAuth(customerEntity, passwordHash, lastLogin, twoFactorEnabled);
        customerRepository.save(customerAuth);

        String riskRating = customerRequestDTO.getRiskRating();
        LocalDate kycReviewDate = customerRequestDTO.getKycReviewDate();
        boolean sanctionsCheckPassed = customerRequestDTO.isSanctionsCheckPassed();
        boolean politicallyExposedPerson = customerRequestDTO.isPoliticallyExposedPerson();

        String city = customerRequestDTO.getCity();
        String email = customerRequestDTO.getEmail();
        String state = customerRequestDTO.getState();
        String country = customerRequestDTO.getCountry();
        String postalCode = customerRequestDTO.getPostalCode();
        String phoneNumber = customerRequestDTO.getPhoneNumber();
        String addressLine1 = customerRequestDTO.getAddressLine1();
        String addressLine2 = customerRequestDTO.getAddressLine2();
        String alternatePhone = customerRequestDTO.getAlternatePhone();

        String documentUrl = customerRequestDTO.getDocumentUrl();
        String idDocumentType = customerRequestDTO.getIdDocumentType();
        String idDocumentNumber = customerRequestDTO.getIdDocumentNumber();
        LocalDate documentExpiryDate = customerRequestDTO.getDocumentExpiryDate();

        System.out.println("Customer Names:- " + customerRequestDTO.getFirstName() + " " + customerRequestDTO.getLastName());
        return ResponseEntity.ok("Customer Successfully Saved");
    }
}
