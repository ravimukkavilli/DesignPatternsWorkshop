package org.patterns.structural.decorator.initial;

public class WeddingServiceWithPhotography extends WeddingService {
    @Override
    public int getCost() {
        return super.getCost() + 15000;
    }
}
