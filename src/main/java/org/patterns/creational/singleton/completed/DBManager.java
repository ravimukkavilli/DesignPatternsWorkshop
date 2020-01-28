package org.patterns.creational.singleton.completed;

public class DBManager {

    private static DBManager instance;

    private DBManager() {
        System.out.println("Creating instance...");
    }

    public static DBManager getInstance() {
        if(instance == null){
            instance = new DBManager();
        }

        return instance;
    }

    @Override
    public String toString() {
        return String.format("%s %d", getClass(), hashCode());
    }
}
