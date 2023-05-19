package com.ricknash.patterns.creational.abstractFactory;

import com.ricknash.patterns.creational.abstractFactory.bank.BankingTeamFactory;

public class RevolutKiller {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        QA qa = projectTeamFactory.getQA();
        PM pm = projectTeamFactory.getPM();

        System.out.println("Creating bank system...");
        developer.writeCode();
        qa.test();
        pm.manage();
    }
}
