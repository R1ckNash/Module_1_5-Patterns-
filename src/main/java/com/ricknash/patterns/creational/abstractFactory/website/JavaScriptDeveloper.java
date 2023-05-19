package com.ricknash.patterns.creational.abstractFactory.website;

import com.ricknash.patterns.creational.abstractFactory.Developer;

public class JavaScriptDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write javaScript code");
    }
}
