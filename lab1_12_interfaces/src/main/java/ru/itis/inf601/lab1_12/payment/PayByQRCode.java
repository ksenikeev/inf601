package ru.itis.inf601.lab1_12.payment;

public class PayByQRCode implements IPaymentSystem{
    private String phoneNumber;
    private String bankName;
    @Override
    public void pay(int sum, String account) {
        System.out.println("Осуществлен платеж на сумму" + sum
                + " на счет " + account + " название банка: " +
                bankName + " с телефона: " + phoneNumber);
    }
    public PayByQRCode (String phoneNumber, String bankName){
        this.bankName=bankName;
        this.phoneNumber=phoneNumber;
    }


}
