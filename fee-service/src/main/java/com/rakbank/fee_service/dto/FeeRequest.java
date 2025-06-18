package com.rakbank.fee_service.dto;
import lombok.Data;

@Data
public class FeeRequest {
    private String studentId;
    private double amount;
    private String mode;
}
