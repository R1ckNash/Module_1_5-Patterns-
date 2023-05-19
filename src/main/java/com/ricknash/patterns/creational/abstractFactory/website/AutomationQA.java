package com.ricknash.patterns.creational.abstractFactory.website;

import com.ricknash.patterns.creational.abstractFactory.QA;

public class AutomationQA implements QA {
    @Override
    public void test() {
        System.out.println("write auto tests");
    }
}
