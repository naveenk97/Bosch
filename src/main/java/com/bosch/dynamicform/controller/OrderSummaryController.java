package com.bosch.dynamicform.controller;

import com.bosch.dynamicform.api.OrderSummaryApi;
import org.springframework.http.ResponseEntity;

public class OrderSummaryController implements OrderSummaryApi {
    @Override
    public ResponseEntity<String> fetchOrderSummary(String orderId) {
        return null;
    }
}
