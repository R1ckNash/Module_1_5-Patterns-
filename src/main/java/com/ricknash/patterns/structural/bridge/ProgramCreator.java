package com.ricknash.patterns.structural.bridge;

public class ProgramCreator {

    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new SwiftDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
