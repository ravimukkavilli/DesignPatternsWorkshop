package org.patterns.structural.composite.completed;

public class ANDGate extends Gate {
    @Override
    public void trigger() {
        System.out.println("Trigger AND");
    }
}
