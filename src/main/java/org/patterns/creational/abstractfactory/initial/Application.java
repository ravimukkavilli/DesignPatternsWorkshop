package org.patterns.creational.abstractfactory.initial;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();

        ComputerA computerA = app.createComputerA();
        ComputerB computerB = app.createComputerB();


    }

    public ComputerA createComputerA(){
        ComputerA computerA = new ComputerA();
        computerA.setMemory(new MemoryA());
        computerA.setCPU(new CPUA());

        return computerA;
    }

    public ComputerB createComputerB(){
        ComputerB computerB = new ComputerB();
        computerB.setMemory(new MemoryB());
        computerB.setCPU(new CPUB());

        return computerB;
    }

}
