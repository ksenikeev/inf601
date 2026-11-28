package ru.itis.inf601.lab1_12.payment;

public class PaymentService {
    private IPaymentSystem paymentSystem;
    public PaymentService(IPaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }
    public void paySum(int sum, String account) {
        paymentSystem.pay(sum,account);
    }
}
