package com.example.cash_deposit.repositories;

import com.example.cash_deposit.entities.CustomerAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAuthRepository extends JpaRepository<CustomerAuth, Long>{}