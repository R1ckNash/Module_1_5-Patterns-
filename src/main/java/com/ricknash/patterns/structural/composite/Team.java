package com.ricknash.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer dev) {
        developers.add(dev);
    }

    public void removeDeveloper(Developer dev) {
        developers.remove(dev);
    }

    public void createProject() {
        System.out.println("Team creates project");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
