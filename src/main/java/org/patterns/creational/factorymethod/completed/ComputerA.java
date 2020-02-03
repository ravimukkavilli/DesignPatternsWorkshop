package org.patterns.creational.factorymethod.completed;

public class ComputerA  extends Computer {

    @Override
    protected void configureComputer() {
        memory = new MemoryA();
        cpu = new CPUA();
    }
}
