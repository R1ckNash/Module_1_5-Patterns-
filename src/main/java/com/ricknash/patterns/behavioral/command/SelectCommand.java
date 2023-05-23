package com.ricknash.patterns.behavioral.command;

public class SelectCommand implements Command{

    DataBase dataBase;

    public SelectCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.select();
    }
}
