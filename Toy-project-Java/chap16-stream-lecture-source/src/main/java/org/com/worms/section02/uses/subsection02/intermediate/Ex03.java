package org.com.worms.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* 설명.
 *  sorted()란?
 *  - 기본은(오름차순) 및 반대(내림차순) 적용
 *  - Compartor 활용 포함
 * */
public class Ex03 {
    public static void main(String[] args) {

        /* 수업목표. sorted() 중개 연산자를 활용할 수 있다. */
        List<Integer> numbers = Arrays.asList(5, 10, 99, 2, 1, 35, 67, 23);

        /* 설명. 기본 정렬: 오름차순 */
        List<Integer> ascList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());          // 최종연산: 원하는 컬렉션으로 바꿈
        System.out.println("ascList: " + ascList);

        /* 설명. 추가 정렬: 내림차순 */
        List<Integer> descList = numbers.stream()
                .sorted(new DescInteger())
                .collect((Collectors.toList()));
        System.out.println("descList: " + descList);

        /* 설명. Comparator.reverseOrder() */
        List<Integer> descList2 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("descList2: " + descList2);


    }
}
