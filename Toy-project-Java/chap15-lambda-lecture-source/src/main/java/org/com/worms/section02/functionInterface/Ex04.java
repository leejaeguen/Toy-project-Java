package org.com.worms.section02.functionInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Ex04 {
    public static void main(String[] args) {
        
        /* 수업목표. 표준 함수적 인터페이스 중 Operator에 대해 이해하고 사용할 수 있다. */
        UnaryOperator<String> operator = str -> "hello " + str;
        System.out.println(operator.apply("World"));
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("nice to ", "meet you"));
    }
}
