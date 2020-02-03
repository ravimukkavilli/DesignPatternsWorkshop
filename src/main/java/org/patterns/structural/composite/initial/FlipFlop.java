package org.patterns.structural.composite.initial;

import java.util.ArrayList;
import java.util.List;

public class FlipFlop extends Gate{
    private List<Gate> gates = new ArrayList<>();

    public void add(Gate gate){
        gates.add(gate);
    }

    public int getNoOfComponents(){
        return gates.size();
    }
}
