package com.ricknash.patterns.creational.singleton;

public class ProgramLogger {

    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            return new ProgramLogger();
        }
        return programLogger;
    }

    ProgramLogger() {}

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
