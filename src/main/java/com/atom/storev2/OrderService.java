package com.atom.storev2;

public class OrderService {
    public void placeOrder()
    {
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
