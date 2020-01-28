package org.patterns.creational.abstractfactory.completed;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();

        Computer computerA = new ComputerA();
        app.createComputer(computerA, new ComputerFactoryA());
        System.out.println(computerA);

        Computer computerB = new ComputerB();
        app.createComputer(computerB, new ComputerFactoryB());
        System.out.println(computerB);
    }

    public void createComputer(Computer computer, ComputerFactory factory){
       computer.setCPU(factory.getCPU());
       computer.setMemory(factory.getMemory());
    }
}
