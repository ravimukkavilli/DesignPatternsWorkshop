package org.patterns.creational.abstractfactory.initial;

public class MemoryA {

    @Override
    public String toString() {
        return String.format("%s %d", getClass(), hashCode());
    }
}
