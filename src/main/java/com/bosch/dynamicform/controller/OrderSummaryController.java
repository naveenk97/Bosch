package com.bosch.dynamicform.controller;

import com.bosch.dynamicform.api.OrderSummaryApi;
import com.bosch.dynamicform.service.OrderSummaryService;
import org.springframework.http.ResponseEntity;

public class OrderSummaryController implements OrderSummaryApi {

    private final OrderSummaryService orderSummaryService;

    public OrderSummaryController(OrderSummaryService orderSummaryService) {
        this.orderSummaryService = orderSummaryService;
    }

    @Override
    public ResponseEntity<String> fetchOrderSummary(String orderId) {
        return orderSummaryService.fetchOrderSummary(orderId);

    }
}
