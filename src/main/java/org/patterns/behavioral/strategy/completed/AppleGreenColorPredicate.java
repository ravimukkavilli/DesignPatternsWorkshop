package org.patterns.behavioral.strategy.completed;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple a) {
        return a.getColor() == Color.GREEN;
    }
}
