package org.example.opencloseprinciple;

abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCardPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using a credit card.");
    }
}

class PayPalPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class PaymentProcessor {
    void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();

        processor.processPayment(creditCard, 100.0);
        processor.processPayment(paypal, 50.0);
    }
}
