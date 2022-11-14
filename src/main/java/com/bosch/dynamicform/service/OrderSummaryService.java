package com.bosch.dynamicform.service;

import org.springframework.http.ResponseEntity;

public interface OrderSummaryService {

    public ResponseEntity<String> fetchOrderSummary(String orderId) throws Exception;
}
