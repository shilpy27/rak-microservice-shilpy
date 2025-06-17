package com.rakbank.fee_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakbank.fee_service.entity.FeeReceipt;

public interface FeeReceiptRepository extends JpaRepository<FeeReceipt, Long> {
}
