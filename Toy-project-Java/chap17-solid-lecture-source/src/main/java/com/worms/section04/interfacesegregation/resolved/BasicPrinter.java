package com.worms.section04.interfacesegregation.resolved;

public class BasicPrinter implements PrintOnly {
    @Override
    public void print() {
        System.out.println("깔끔하게 문서를 출력합니다.");
    }
}
