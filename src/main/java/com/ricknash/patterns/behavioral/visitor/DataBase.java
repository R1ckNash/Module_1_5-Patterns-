package com.ricknash.patterns.behavioral.visitor;

public class DataBase implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
