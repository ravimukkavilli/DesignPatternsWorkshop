package org.patterns.creational.abstractfactory.initial;

public class ComputerA {
    private MemoryA memoryA;
    private CPUA cpua;
    public void setMemory(MemoryA memoryA) {
        memoryA = memoryA;
    }

    public void setCPU(CPUA cpua) {
        this.cpua = cpua;
    }
}
