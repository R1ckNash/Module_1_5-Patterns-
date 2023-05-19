package com.ricknash.patterns.creational.abstractFactory;

import com.ricknash.patterns.creational.abstractFactory.website.WebsiteTeamFactory;

public class NetflixKiller {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        QA qa = projectTeamFactory.getQA();
        PM pm = projectTeamFactory.getPM();

        System.out.println("Creating netflixKiller..");
        developer.writeCode();
        qa.test();
        pm.manage();
    }
}
