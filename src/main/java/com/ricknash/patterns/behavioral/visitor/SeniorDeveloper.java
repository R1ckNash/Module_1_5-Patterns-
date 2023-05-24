package com.ricknash.patterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Fixing code after junior");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Tuning db");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable tests");
    }
}
