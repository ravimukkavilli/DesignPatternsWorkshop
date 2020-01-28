package org.patterns.creational.abstractfactory.completed;

public abstract class Computer {
    private Memory memory;
    private CPU cpu;
    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory=" + memory +
                ", cpu=" + cpu +
                '}';
    }
}
