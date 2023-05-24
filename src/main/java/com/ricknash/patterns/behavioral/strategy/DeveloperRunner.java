package com.ricknash.patterns.behavioral.strategy;

public class DeveloperRunner {

    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.setActivity(new Sleep());
        dev.executeActivity();

        dev.setActivity(new Read());
        dev.executeActivity();

        dev.setActivity(new Code());
        dev.executeActivity();
    }
}
