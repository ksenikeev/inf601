package ru.itis.inf601.lab1_12.payment;

public class PayByCard implements IPaymentSystem {
    private String cardNumber;

    public PayByCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int sum, String account) {
        System.out.println("Осуществлен платеж в размере: " +
                sum + " с карты: " + cardNumber + " на счет: " +
                account);
    }
}
