package com.ricknash.patterns.creational.abstractFactory.bank;

import com.ricknash.patterns.creational.abstractFactory.PM;

public class BankingPM implements PM {
    @Override
    public void manage() {
        System.out.println("Manage bank project");
    }
}
