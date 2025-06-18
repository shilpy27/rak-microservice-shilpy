package com.rakbank.fee_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeeReceipt {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String receiptNumber;
    private String studentId;
    private String studentName;
    private String grade;
    private String mobileNumber;
    private String schoolName;

    private double amount;
    private String paymentMode;
    private LocalDateTime paymentDate;
    private String cashierName;
    private String remarks;
}
