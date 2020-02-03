package org.patterns.creational.factorymethod.completed;

public class ComputerB extends Computer {

    @Override
    protected void configureComputer() {
        memory = new MemoryB();
        cpu = new CPUB();
    }
}
