package com.ricknash.patterns.creational.abstractFactory.bank;

import com.ricknash.patterns.creational.abstractFactory.QA;

public class ManualQA implements QA {
    @Override
    public void test() {
        System.out.println("test banking system");
    }
}
