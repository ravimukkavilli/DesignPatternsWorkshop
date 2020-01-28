package org.patterns.creational.abstractfactory.step1;

public abstract class Memory {

    @Override
    public String toString() {
        return String.format("%s %d", getClass(), hashCode());
    }
}
