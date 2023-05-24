package com.ricknash.patterns.behavioral.visitor;

public class JuniorDeveloper implements Developer {


    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor code");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop db");
    }

    @Override
    public void create(Test test) {
        System.out.println("Bad tests");
    }
}
