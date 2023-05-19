package com.ricknash.patterns.creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    QA getQA();
    PM getPM();
}
