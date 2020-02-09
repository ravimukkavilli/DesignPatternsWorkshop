package org.patterns.structural.decorator.initial;

public class WeddingServiceWithPhotographyAndVideography extends WeddingServiceWithPhotography {
    @Override
    public int getCost() {
        return super.getCost() + 15000;
    }
}
