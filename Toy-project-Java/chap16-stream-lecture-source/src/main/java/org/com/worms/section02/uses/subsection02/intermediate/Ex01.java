package org.com.worms.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/* 설명.
 *  filter()란?
 *   - 스트림의 요소 중에 조건을 만족하는요소들만 걸러내는 중간 연산
 *   - 중간 연산들은 최종 연산 전에는 실행되지 않음
 * */
public class Ex01 {
    public static void main(String[] args) {

        /* 수업목표. filter() 중계 연산자를 활용할 수 있다. */
        IntStream.range(0, 10)
                // .peek(n -> System.out.println(n + " "))
                .filter(n -> n > 5)
                // .peek(n -> System.out.println("필터링 이후" + n + " "))
                .forEach(System.out::println);

        /* 설명.
         *  Arrays.stream()은 배열(int[])만 인자로 받으며, 배열의 각 요소로 스트림을 만듦
         *  반면, IntStream.of()는 IntStream.of(1, 2, 3)처럼 숫자를 직접 나열 할 수도 있다.
        * */
        int[] scores = {45, 78, 92, 67, 88, 59, 95, 73, 84, 52};
        IntStream sStream = Arrays.stream(scores);       // 배열일 경우는 이걸 더 선호
        sStream.filter(n -> n > 70)
                .forEach(n -> System.out.println(n + "점"));

        // IntStream.of(45, 78, 92, 67, 88, 59, 95, 73, 84, 52);         // 배열이 아닐 경우 이걸 더 선호
        IntStream.of(scores)
                .filter(n -> n > 70)
                .forEach(n -> System.out.println(n + "점"));

        /* 설명. 문자열 스트림 관련 */
        List<String> planguage = Arrays.asList(
                "java", "Python", "js", "C++", "go", "Rust", "Kotlin"
        );

        planguage.stream()
                .filter(lang -> lang.startsWith("j"))
                .forEach(System.out::println);

        System.out.println("4글자 이하의 단어만 출력");
        planguage.stream()
                .filter(lang -> lang.length() < 5)
                .forEach(System.out::println);

        /* 설명. 복합 조건 필터링 */
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 3 == 0)
                .filter( n -> n > 10)
                .forEach(n -> System.out.println(n + " "));
    }

}
