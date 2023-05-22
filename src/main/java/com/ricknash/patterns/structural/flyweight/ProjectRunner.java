package com.ricknash.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("swift"));
        developers.add(developerFactory.getDeveloperBySpeciality("swift"));
        developers.add(developerFactory.getDeveloperBySpeciality("swift"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
