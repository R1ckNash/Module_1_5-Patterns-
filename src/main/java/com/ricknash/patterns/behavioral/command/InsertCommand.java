package com.ricknash.patterns.behavioral.command;

public class InsertCommand implements Command {

    DataBase dataBase;

    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
