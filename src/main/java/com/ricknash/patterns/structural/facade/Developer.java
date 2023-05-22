package com.ricknash.patterns.structural.facade;

public class Developer {

    public void doJobBeforeDeadline(Bugtracker bugtracker) {
        if (bugtracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Relaxing");
        }
    }
}
