package com.ricknash.patterns.creational.factory;

public class PythonDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
