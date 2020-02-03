package org.patterns.structural.composite.initial;

import java.util.ArrayList;
import java.util.List;

public class Board {

    List<Gate> gates = new ArrayList<>();

    public void add(Gate gate) {
        this.gates.add(gate);
    }

    public int getNoOfComponents() {
        return gates.size();
    }

    public Gate getGateAt(int location) {
        return gates.get(location);
    }
}
