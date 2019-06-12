package com.demo.spring.test;

import java.text.NumberFormat;

public class Test {
    public static void main(String[] args) {
        double d = 12345.6789;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        String str = numberFormat.format(d);
        System.out.println(str);
    }
}
