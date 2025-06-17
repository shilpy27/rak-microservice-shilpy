package com.rakbank.fee_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rakbank.fee_service.dto.FeeRequest;
import com.rakbank.fee_service.dto.StudentResponse;
import com.rakbank.fee_service.entity.FeeReceipt;
import com.rakbank.fee_service.repository.FeeReceiptRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class FeeServiceImpl implements FeeService {

    @Autowired
    private FeeReceiptRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    private final String STUDENT_SERVICE_URL = "http://student-service/students/";

    @Override
    public FeeReceipt collectFee(FeeRequest request) {
        StudentResponse student = restTemplate.getForObject(
                STUDENT_SERVICE_URL + request.getStudentId(), StudentResponse.class);

        FeeReceipt receipt = new FeeReceipt();
        receipt.setReceiptNumber("RCPT-" + UUID.randomUUID().toString().substring(0, 8));
        receipt.setStudentId(request.getStudentId());
        receipt.setStudentName(student.getStudentName());
        receipt.setGrade(student.getGrade());
        receipt.setMobileNumber(student.getMobileNumber());
        receipt.setSchoolName(student.getSchoolName());
        receipt.setAmount(request.getAmount());
        receipt.setPaymentMode(request.getMode());
        receipt.setPaymentDate(LocalDateTime.now());
        receipt.setCashierName("System");
        receipt.setRemarks("Fee collected");

        return repository.save(receipt);
    }

    @Override
    public List<FeeReceipt> getAllReceipts() {
        return repository.findAll();
    }
}