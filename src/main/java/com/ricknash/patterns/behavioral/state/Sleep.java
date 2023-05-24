package com.ricknash.patterns.behavioral.state;

public class Sleep implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Sleep");
    }
}
