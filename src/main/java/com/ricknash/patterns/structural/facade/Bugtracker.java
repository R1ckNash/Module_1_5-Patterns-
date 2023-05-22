package com.ricknash.patterns.structural.facade;

public class Bugtracker {

    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is finished");
        activeSprint = false;
    }
}
