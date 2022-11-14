package com.bosch.dynamicform.dto;


import java.util.List;

public class OrderSummaryDto {

    private String orderId;
    private String sellerName;
    private String buyerName;
    private String mailId;
    private String location;
    private String shippingAddress;
    private String pickupAddress;
    private List<Documents> documents;
    private Payment payment;


    public class Payment {
        private String paymentMethod;
        private String subtotal;
        private String shipping;
        private String total;
        private String grandTotal;

    }

    public class Documents {
        private String docuumentId;
        private String documentType;
        private String documentUrl;

    }
}
