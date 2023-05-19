package com.ricknash.patterns.creational.abstractFactory.website;

import com.ricknash.patterns.creational.abstractFactory.PM;

public class WebsitePM implements PM {
    @Override
    public void manage() {
        System.out.println("manage site");
    }
}
