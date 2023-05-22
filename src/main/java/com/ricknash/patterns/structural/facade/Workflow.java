package com.ricknash.patterns.structural.facade;

public class Workflow {

    Developer dev = new Developer();
    Job job = new Job();
    Bugtracker bugtracker = new Bugtracker();

    public void solvingProblems() {
        job.doJob();
        bugtracker.startSprint();
        dev.doJobBeforeDeadline(bugtracker);
    }
}
