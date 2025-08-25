package com.worms.section03.liskovsustitution.problem;

/* 설명.
 *  리스코프 치환 원칙(Liskov Substitution Principle) - "상속 받으면 부모의 행동 양식을 바꾸지 마!"
 *   - 상위 타입의 객체를 하위 타입의 객체로 치환해도 프로그램의 정확성이 깨지지 않아야 한다.
 *   - 하위 타입은 상위 타입의 규칙(규약)을 지켜야 한다.
* */
public class Ex01 {
    public static void main(String[] args) {
        System.out.println("직사각형 테스트");
        BadRectangle badRectangle = new BadRectangle();
        testRectangle(badRectangle);

        System.out.println("정사각형 테스트");
        BadRectangle badSquare = new BadRectangle();
        testRectangle(badSquare);

    }

    private static void testRectangle(BadRectangle badRectangle) {
        badRectangle.setWidth(5);
        badRectangle.setHeight(10);

        System.out.println("기대하는 넓이: 50 ");
        System.out.println("실제 넓이: " + badRectangle.getArea());

        System.out.println("제대로 동작하는 지 확인: " + (badRectangle.getArea() == 50? "성공": "실패"));
    }
}
