package ru.itis.inf601.lab1_12.payment;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму платежа");
        int sum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите номер счета");
        String account = scanner.nextLine();
        System.out.println("Выберите способ платежа (1 - карта, 2 - QR-код): ");
        int payMethod = scanner.nextInt();
        scanner.nextLine();

        IPaymentSystem paymentSystem = null;
        switch (payMethod) {
            case 1:
                System.out.println("Введите номер карты: ");
                String card = scanner.nextLine();
                paymentSystem = new PayByCard(card);
                break;
            case 2:
                System.out.println("Введите номер телефона: ");
                String phoneNumber = scanner.nextLine();
                System.out.println("Введите название банка: ");
                String bankName = scanner.nextLine();
                paymentSystem = new PayByQRCode(phoneNumber,bankName);
                break;
        }
        PaymentService paymentService = new PaymentService(paymentSystem);
        paymentService.paySum(sum,account);
    }
}
