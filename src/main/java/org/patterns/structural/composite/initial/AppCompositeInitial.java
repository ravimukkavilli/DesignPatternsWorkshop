package org.patterns.structural.composite.initial;

public class AppCompositeInitial {

    public static void main(String[] args) {
        Board board = new Board();

        board.add(new ANDGate());
        board.add(new ORGate());
        board.add(new ANDGate());
        board.add(new FlipFlop());

        // what happens if we introduce yet another gate like XOR

        addAComponentToAFlipFlop(board, 3, new ANDGate());
        addAComponentToAFlipFlop(board, 3, new ORGate());

        System.out.println(board.getNoOfComponents());

        for(int i = 0;i < board.getNoOfComponents(); i++){
            Gate gateAtLocation = board.getGateAt(i);
            System.out.println(gateAtLocation);
            // violates LSP and OC
            if(gateAtLocation instanceof FlipFlop){
                FlipFlop flipFlop = (FlipFlop) gateAtLocation;
                System.out.println(String.format("Component contains: "+ flipFlop.getNoOfComponents()));
            }
        }

    }

    private static void addAComponentToAFlipFlop(Board board, int location, Gate gate) {
        Gate gateAtLocation = board.getGateAt(location);
        // violates LSP and OC
        if(gateAtLocation instanceof FlipFlop){
           FlipFlop flipFlop = (FlipFlop) gateAtLocation;
           flipFlop.add(gate);
        } else {
            throw new RuntimeException("Can't add Gate to the component.");
        }

    }


}
