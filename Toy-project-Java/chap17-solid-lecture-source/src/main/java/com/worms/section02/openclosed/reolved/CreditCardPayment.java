package com.worms.section02.openclosed.reolved;

public class CreditCardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("신용카드로 결제 처리");
    }
}
