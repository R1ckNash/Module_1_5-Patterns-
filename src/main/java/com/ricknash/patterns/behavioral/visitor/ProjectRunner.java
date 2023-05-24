package com.ricknash.patterns.behavioral.visitor;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("junior in action");
        project.beWritten(junior);

        System.out.println();

        System.out.println("senior in action");
        project.beWritten(senior);
    }
}
