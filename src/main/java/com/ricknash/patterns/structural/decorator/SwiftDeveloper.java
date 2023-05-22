package com.ricknash.patterns.structural.decorator;

public class SwiftDeveloper extends DeveloperDecorator {

    public SwiftDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make mobile app";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
