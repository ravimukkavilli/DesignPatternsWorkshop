package org.patterns.creational.abstractfactory.completed;

public class ComputerFactoryB implements ComputerFactory {
    @Override
    public Memory getMemory() {
        return new MemoryB();
    }

    @Override
    public CPU getCPU() {
        return new CPUB();
    }
}
