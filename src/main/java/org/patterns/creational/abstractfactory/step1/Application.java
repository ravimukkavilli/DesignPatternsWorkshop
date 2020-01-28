package org.patterns.creational.abstractfactory.step1;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();

        Computer computerA = new ComputerA();
        app.createComputer(computerA);
        System.out.println(computerA);

        Computer computerB = new ComputerB();
        app.createComputer(computerB);
        System.out.println(computerA);
    }

    public void createComputer(Computer computer){
        if(computer instanceof ComputerA){
            computer.setMemory(new MemoryA());
            computer.setCPU(new CPUA());
        } else if(computer instanceof ComputerB){
            computer.setMemory(new MemoryA());
            computer.setCPU(new CPUA());
        }
    }
}
