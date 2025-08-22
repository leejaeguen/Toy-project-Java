package org.com.worms.section02.uses.subsection03.terminal;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/* 설명.
 *  최종 연산이란?
 *   - 스트림의 파이프라인 마지막에 위치하며 결과를 생성하는 연산
 *   - 지연평가: 최종 연산이 실행되기 전에는 중간 연산을 하지 않음
 *   - 최종 연산 후에는 스트림을 재사용할 수 없음
 *
 * 설명.
 *  - count(), sum(), max(), min(), average() ...
* */
public class Ex01 {
    public static void main(String[] args) {

        /* 수업목표. calculation 관련 최종 연산자를 활용할 수 있다. */
        long count = IntStream.range(1, 10).count();
        System.out.println("Count : " + count);
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum : " + sum);

        /* 설명. Optional 관련 타입을 반환하며 존재하지 않는 값에 대한 구체적인 처리를 할 수 있음 */
        /* 설명. 안전한 기본값 처리를 중요하게 생각하며 활용하는 것이 원칙  */
        OptionalInt max = IntStream.range(1, 1).max();
        System.out.println("Max : " + max);
        OptionalInt maxnot =  IntStream.rangeClosed(1, 1).max();  // range 범위를 통해 숫자 생성 X
        System.out.println("Maxnot : " + maxnot);                 // 존재하지 않으면 empty 처리
        System.out.println("Maxnot : " + maxnot.orElse(0));

        OptionalInt min = IntStream.rangeClosed(1, 10).min();
        System.out.println("Min : " + min.getAsInt());  // 숫자만 추출할 수도 있지만 가급적 get메소드는 안 쓰는게 좋음
                                                        // 존재하지 않을 경우를 감안해서 만들어진 메소드 활용이 목적에 부합

        OptionalDouble avg = IntStream.range(1, 10).average();
        System.out.println("Avg : " + avg);  // 존재하면 숫자로만 나오기도 함

        /* 설명. 홀수/짝수 분석 */
        /* 설명. 1. 홀수 분석 */
        long oddCount = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 != 0)
                .count();
        System.out.println("Odd Count : " + oddCount);

        /* 설명. 2. 짝수 분석 */
        long evenCount = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Even Count : " + evenCount);

        /* 설명. 짝수 합의 평균 */
        OptionalDouble optionalDouble = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .average();
        System.out.println("짝수 합의 평균 : " + optionalDouble.orElse(0));
    }
}
