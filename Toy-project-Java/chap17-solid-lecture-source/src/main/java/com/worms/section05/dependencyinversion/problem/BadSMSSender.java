package com.worms.section05.dependencyinversion.problem;

public class BadSMSSender {
    public void sendSMS(String message) {
        System.out.println("문자 발송: " + message);
    }
}
