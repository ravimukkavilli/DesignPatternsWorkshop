package org.patterns.creational.abstractfactory.initial;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();

        ComputerA computerA = new ComputerA();
        app.createComputer(computerA);
        System.out.println(computerA);

        ComputerB computerB = new ComputerB();
        app.createComputer(computerB);
        System.out.println(computerB);
    }

    public void createComputer(ComputerA computerA){
        computerA.setMemory(new MemoryA());
        computerA.setCPU(new CPUA());
    }

    public void createComputer(ComputerB computerB){
        computerB.setMemory(new MemoryB());
        computerB.setCPU(new CPUB());
    }

}
