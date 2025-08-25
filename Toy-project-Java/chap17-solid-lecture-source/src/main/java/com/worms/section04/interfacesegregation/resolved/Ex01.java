package com.worms.section04.interfacesegregation.resolved;

public class Ex01 {
    public static void main(String[] args) {
        BasicPrinter bp  = new BasicPrinter();
        bp.print();

        AdvancedPrinter ap = new AdvancedPrinter();
        ap.print();
        ap.fax();
        ap.scan();
    }
}
