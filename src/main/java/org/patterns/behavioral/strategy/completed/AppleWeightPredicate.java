package org.patterns.behavioral.strategy.completed;

public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple a) {
        return a.getWeight() > 150;
    }
}
