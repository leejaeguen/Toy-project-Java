package com.worms.section02.openclosed.reolved;

public class KakaoCardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("카카오페이로 결제 처리");
    }
}
