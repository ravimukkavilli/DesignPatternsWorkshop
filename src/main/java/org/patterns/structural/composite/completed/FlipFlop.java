package org.patterns.structural.composite.completed;

import java.util.ArrayList;
import java.util.List;

public class FlipFlop extends Gate {
    private List<Gate> gates = new ArrayList<>();

    public void add(Gate gate){
        gates.add(gate);
    }

    public int getNoOfComponents(){
        return gates.size();
    }

    @Override
    public void trigger() {
        super.trigger();
        for(Gate gate : gates){
            gate.trigger();
        }
    }
}
