package com.ricknash.patterns.structural.composite;

public class Project {

    public static void main(String[] args) {
        Team team = new Team();

        Developer javaDeveloper = new JavaDeveloper();
        Developer swiftDeveloper = new SwiftDeveloper();
        Developer javaDeveloper1 = new JavaDeveloper();

        team.addDeveloper(javaDeveloper);
        team.addDeveloper(javaDeveloper1);
        team.addDeveloper(swiftDeveloper);

        team.createProject();
    }
}
