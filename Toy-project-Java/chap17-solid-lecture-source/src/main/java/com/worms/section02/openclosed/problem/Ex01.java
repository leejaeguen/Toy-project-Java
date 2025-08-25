package com.worms.section02.openclosed.problem;

import com.worms.section01.singleresponsibility.problem.BadEmployee;

/* 설명.
 *  개방-폐쇠 원칙(Open-Closed Principle) - "확장할 때 기존 코드를 수정하며 확장하면 안돼!"
 *  - 소프트웨어의 엔티티(클래스, 모듈, 함수 등)는 확장에 대해서는 열려 있어야 하지만,
 *    변경에 대해서는 닫혀 있어야 한다.
* */
public class Ex01 {
    public static void main(String[] args) {
        BadPaymentProcessor badProcessor = new BadPaymentProcessor();
        badProcessor.processPayment("credit");  // 신용카드 결제
        badProcessor.processPayment("kakao");   // 카카오페이 결제

    }
}
