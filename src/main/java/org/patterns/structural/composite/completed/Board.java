package org.patterns.structural.composite.completed;

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

    public void trigger() {
        for(Gate gate : gates){
            gate.trigger();
        }
    }
}
