package com.ricknash.patterns.structural.decorator;

public class Task {

    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloper();

        System.out.println(javaDeveloper.makeJob());

        Developer swiftDeveloper = new SwiftDeveloper(javaDeveloper);

        System.out.println(swiftDeveloper.makeJob());
    }
}
