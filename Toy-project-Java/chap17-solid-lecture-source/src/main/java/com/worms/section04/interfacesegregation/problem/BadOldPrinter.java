package com.worms.section04.interfacesegregation.problem;

public class BadOldPrinter implements BadOldMachine {

    @Override
    public void print() {
        System.out.println("문서를 힘겹게 출력합니다.");
    }

    @Override
    public void fax() {
        /* 설명. fax 기능은 지원조차 되지 않음 */
    }

    @Override
    public void scan() {
        /* 설명. scan 기능은 지원조차 되지 않음 */
    }
}
