package org.patterns.creational.abstractfactory.initial;

public class ComputerA {
    private MemoryA memoryA;
    private CPUA cpua;
    public void setMemory(MemoryA memoryA) {
        this.memoryA = memoryA;
    }

    public void setCPU(CPUA cpua) {
        this.cpua = cpua;
    }

    @Override
    public String toString() {
        return "ComputerA{" +
                "memoryA=" + memoryA +
                ", cpua=" + cpua +
                '}';
    }
}
