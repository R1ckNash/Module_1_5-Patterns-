package com.ricknash.patterns.behavioral.memento;

public class SaveProjectRunner {

    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo repo = new GithubRepo();

        System.out.println("Creating new project 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current project to github");
        repo.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code");

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong");

        System.out.println("Rolling back to version 1.0");
        project.load(repo.getSave());

        System.out.println("Project after rollback");

        System.out.println(project);
    }
}
