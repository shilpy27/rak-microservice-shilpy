package com.rakbank.fee_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rakbank.fee_service.dto.FeeRequest;
import com.rakbank.fee_service.entity.FeeReceipt;
import com.rakbank.fee_service.service.FeeService;

import java.util.List;

@RestController
@RequestMapping("/fees")
public class FeeController {

    @Autowired
    private FeeService feeService;

    @PostMapping("/collect")
    public ResponseEntity<FeeReceipt> collectFee(@RequestBody FeeRequest request) {
        return ResponseEntity.ok(feeService.collectFee(request));
    }

    @GetMapping("/receipts")
    public ResponseEntity<List<FeeReceipt>> getAllReceipts() {
        return ResponseEntity.ok(feeService.getAllReceipts());
    }
}
