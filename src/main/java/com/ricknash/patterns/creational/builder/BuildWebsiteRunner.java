package com.ricknash.patterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new GaleraWebsiteBuilder());

        Website website = director.build();

        System.out.println(website);
    }
}
