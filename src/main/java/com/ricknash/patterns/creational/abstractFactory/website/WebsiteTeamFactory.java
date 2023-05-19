package com.ricknash.patterns.creational.abstractFactory.website;

import com.ricknash.patterns.creational.abstractFactory.Developer;
import com.ricknash.patterns.creational.abstractFactory.PM;
import com.ricknash.patterns.creational.abstractFactory.ProjectTeamFactory;
import com.ricknash.patterns.creational.abstractFactory.QA;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaScriptDeveloper();
    }

    @Override
    public QA getQA() {
        return new AutomationQA();
    }

    @Override
    public PM getPM() {
        return new WebsitePM();
    }
}
