package com.ricknash.patterns.creational.abstractFactory.bank;

import com.ricknash.patterns.creational.abstractFactory.Developer;
import com.ricknash.patterns.creational.abstractFactory.PM;
import com.ricknash.patterns.creational.abstractFactory.ProjectTeamFactory;
import com.ricknash.patterns.creational.abstractFactory.QA;

public class BankingTeamFactory implements ProjectTeamFactory
{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public QA getQA() {
        return new ManualQA();
    }

    @Override
    public PM getPM() {
        return new BankingPM();
    }
}
