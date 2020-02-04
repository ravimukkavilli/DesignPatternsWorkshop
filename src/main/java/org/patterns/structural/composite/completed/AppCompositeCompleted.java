package org.patterns.structural.composite.completed;

public class AppCompositeCompleted {

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

        System.out.println("Board Triggered..");
        board.trigger();

        for(int i = 0;i < board.getNoOfComponents(); i++){
            Gate gateAtLocation = board.getGateAt(i);
            System.out.println(gateAtLocation);
            int count = gateAtLocation.getNoOfComponents();

            if(count > 0){
                System.out.println(String.format("contains: "+ gateAtLocation.getNoOfComponents()+" components"));
            }
        }

    }

    private static void addAComponentToAFlipFlop(Board board, int location, Gate gate) {
        Gate gateAtLocation = board.getGateAt(location);
        gateAtLocation.add(gate);
    }


}
