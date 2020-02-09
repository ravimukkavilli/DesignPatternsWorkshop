package org.patterns.behavioral.strategy.completed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStrategyCompleted {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));


        System.out.println(filter(inventory, new AppleGreenColorPredicate()));
        System.out.println(filter(inventory, new AppleRedAndHeavyPredicate()));
        System.out.println(filter(inventory, new AppleWeightPredicate()));

    }


    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


}
