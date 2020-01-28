package org.patterns.creational.abstractfactory.completed;

public class ComputerFactoryA implements ComputerFactory {
    @Override
    public Memory getMemory() {
        return new MemoryA();
    }

    @Override
    public CPU getCPU() {
        return new CPUA();
    }
}
