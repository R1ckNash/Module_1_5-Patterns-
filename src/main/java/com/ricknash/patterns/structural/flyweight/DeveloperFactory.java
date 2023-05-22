package com.ricknash.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer dev = developers.get(speciality);

        if (dev == null) {
            switch (speciality) {
                case "swift" -> {
                    System.out.println("Hiring new Swift developer...");
                    dev = new SwiftDeveloper();
                }
                case "java" -> {
                    System.out.println("Hiring new Java developer");
                    dev = new JavaDeveloper();
                }
            }
        }
        developers.putIfAbsent(speciality, dev);
        return dev;
    }
}
