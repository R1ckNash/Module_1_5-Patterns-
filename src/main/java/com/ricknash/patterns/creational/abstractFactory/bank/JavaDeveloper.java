package com.ricknash.patterns.creational.abstractFactory.bank;

import com.ricknash.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code for bank");
    }
}
