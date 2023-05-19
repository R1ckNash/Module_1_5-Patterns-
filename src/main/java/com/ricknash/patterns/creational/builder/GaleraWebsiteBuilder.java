package com.ricknash.patterns.creational.builder;

public class GaleraWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALFREDO);
    }

    @Override
    void buildPrice() {
        website.setPrice(100000);
    }
}
