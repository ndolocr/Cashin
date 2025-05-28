/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cash_deposit.customer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author user
 */

public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender; // Could also be an enum
    private LocalDate dateOfBirth;
    private String nationality;
    private String nationalIdNumber; // e.g., ID/Passport Number
    private String kycStatus; // e.g., VERIFIED, PENDING, REJECTED 
}
