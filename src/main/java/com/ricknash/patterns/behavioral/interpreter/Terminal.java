package com.ricknash.patterns.behavioral.interpreter;

public class Terminal implements Expression {

    private String data;

    public Terminal(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
