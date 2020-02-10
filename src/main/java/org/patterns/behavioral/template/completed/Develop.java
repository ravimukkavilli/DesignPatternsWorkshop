package org.patterns.behavioral.template.completed;

public abstract class Develop {

    public void code(){
        keyInCode();
        compileCode();
        testCode();
    }
    public abstract void keyInCode();

    public abstract void compileCode();

    public abstract void testCode();
}
