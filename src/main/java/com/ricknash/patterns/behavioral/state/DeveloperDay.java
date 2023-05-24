package com.ricknash.patterns.behavioral.state;

public class DeveloperDay {

    public static void main(String[] args) {
        Activity activity = new Sleep();
        Developer dev = new Developer();

        dev.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            dev.justDoIt();
            dev.changeActivity();
        }
    }
}
