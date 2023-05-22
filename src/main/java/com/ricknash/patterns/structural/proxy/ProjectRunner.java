package com.ricknash.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("googl.com");
        project.run();
    }
}
