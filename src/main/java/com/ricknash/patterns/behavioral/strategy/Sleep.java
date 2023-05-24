package com.ricknash.patterns.behavioral.strategy;

public class Sleep implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Sleep");
    }
}
