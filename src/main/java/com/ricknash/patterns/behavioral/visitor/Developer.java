package com.ricknash.patterns.behavioral.visitor;

public interface Developer {

    public void create(ProjectClass projectClass);

    public void create(DataBase dataBase);

    public void create(Test test);
}
