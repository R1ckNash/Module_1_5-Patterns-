package com.ricknash.patterns.structural.adapter;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDB();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
