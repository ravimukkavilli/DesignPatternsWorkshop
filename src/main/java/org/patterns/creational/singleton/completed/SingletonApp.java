package org.patterns.creational.singleton.completed;

public class SingletonApp {

    public static void main(String[] args) {
        DBManager dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        DBManager dbManager1 = DBManager.getInstance();
        System.out.println(dbManager1);

    }
}
