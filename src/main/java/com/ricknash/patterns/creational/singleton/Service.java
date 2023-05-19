package com.ricknash.patterns.creational.singleton;

public class Service {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First");
        ProgramLogger.getProgramLogger().addLogInfo("Second");
        ProgramLogger.getProgramLogger().addLogInfo("Third");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
