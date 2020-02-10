package org.patterns.behavioral.template.completed;

public class DevelopCSCode extends Develop {

    public void keyInCode(){
        System.out.println("Key in C# code with test.");
    }

    public void compileCode(){
        System.out.println("Run csc.");
    }

    public void testCode(){
        System.out.println("Run NUnit.");
    }
}
