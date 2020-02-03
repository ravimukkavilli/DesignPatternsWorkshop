package org.patterns.creational.factorymethod.completed;

public class FactoryMethodCompletedApp {

    public static void main(String[] args) {

        FactoryMethodCompletedApp app = new FactoryMethodCompletedApp();

        Computer computerA = new ComputerA();
        app.configureComputer(computerA);
        Computer computerB = new ComputerB();
        app.configureComputer(computerB);
    }

    private void configureComputer(Computer computer){
        computer.configureComputer();
        System.out.println(computer);
    }
}
