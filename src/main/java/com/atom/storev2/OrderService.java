package com.atom.storev2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public void placeOrder()
    {
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public OrderService() {
        
    }
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
