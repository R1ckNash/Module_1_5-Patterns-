package com.ricknash.patterns.behavioral.observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("QA");
        jobSite.addVacancy("Python dev");
        jobSite.addVacancy("Front");

        Observer firstSub = new Subscriber("Vasya");
        Observer secondSub = new Subscriber("Tolya");

        jobSite.addObserver(firstSub);
        jobSite.addObserver(secondSub);

        jobSite.addVacancy("Java dev");

        jobSite.removeVacancy("QA");
    }
}
