package com.rakbank.fee_service.service;

import java.util.List;

import com.rakbank.fee_service.dto.FeeRequest;
import com.rakbank.fee_service.entity.FeeReceipt;

public interface FeeService {
	FeeReceipt collectFee(FeeRequest request);

	List<FeeReceipt> getAllReceipts();
}