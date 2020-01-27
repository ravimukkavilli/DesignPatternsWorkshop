package org.patterns.creational.abstractfactory.initial;

public class ComputerB {
    private MemoryB memoryB;
    private CPUB cpub;
    public void setMemory(MemoryB memoryB) {
        this.memoryB = memoryB;
    }

    public void setCPU(CPUB cpub) {
        this.cpub = cpub;
    }
}
