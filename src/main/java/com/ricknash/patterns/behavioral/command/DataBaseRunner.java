package com.ricknash.patterns.behavioral.command;

public class DataBaseRunner {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Developer dev = new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase)
        );

        dev.insertRecord();
        dev.updateRecord();
        dev.selectRecord();
        dev.deleteRecord();
    }
}
