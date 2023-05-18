package com.ricknash.patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpec("python");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpec(String spec) {
        if (spec.equalsIgnoreCase("java")) return new JavaDeveloperFactory();
        else if (spec.equalsIgnoreCase("python")) return new PythonDeveloperFactory();
        else throw new RuntimeException();
    }
}
