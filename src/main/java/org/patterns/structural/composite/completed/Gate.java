package org.patterns.structural.composite.completed;

public abstract class Gate {


    public void add(Gate gate){

        throw new RuntimeException("Can't add Gate to the component.");
    }

    public int getNoOfComponents(){
        return 0;
    }

    public void trigger(){
        System.out.println("Trigger "+ getClass());
    }
}
