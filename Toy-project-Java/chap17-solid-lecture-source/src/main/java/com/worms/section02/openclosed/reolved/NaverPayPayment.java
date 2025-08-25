package com.worms.section02.openclosed.reolved;

public class NaverPayPayment implements Payment {
    @Override
    public void process() {
        System.out.println("네이버 결제 처리");
    }
}
