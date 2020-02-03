package org.patterns.creational.factorymethod.completed;

public abstract class Computer {
    protected Memory memory;
    protected CPU cpu;
    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    protected abstract void configureComputer();

    @Override
    public String toString() {
        return getClass()+ "{" +
                "memory=" + memory +
                ", cpu=" + cpu +
                '}';
    }
}
