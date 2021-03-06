package org.patterns.creational.abstractfactory.completed;

public abstract class Memory {

    @Override
    public String toString() {
        return String.format("%s %d", getClass(), hashCode());
    }
}
