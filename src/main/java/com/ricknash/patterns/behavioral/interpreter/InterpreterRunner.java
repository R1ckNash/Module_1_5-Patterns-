package com.ricknash.patterns.behavioral.interpreter;

public class InterpreterRunner {

    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does java developer knows java core: " + isJava.interpret("Java core"));

        System.out.println("Does java developer knows java core and spring: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new Terminal("Java");
        Expression javaCore = new Terminal("Java core");

        return new Or(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new Terminal("Java");
        Expression spring = new Terminal("Spring");

        return new And(java, spring);
    }
}
