package org.patterns.structural.decorator.initial;

public class AppDecoratorInitial {
    public static void main(String[] args) {

        // get the cost of the wedding service only

        WeddingService weddingService = new WeddingService();
        System.out.println(String.format("Wedding service cost %d", weddingService.getCost()));
        WeddingServiceWithPhotography weddingServiceWithPhotography = new WeddingServiceWithPhotography();
        System.out.println(String.format("Wedding service with Photography cost %d", weddingServiceWithPhotography.getCost()));
        WeddingServiceWithPhotography wedServiceWithPhotoAndVideo = new WeddingServiceWithPhotographyAndVideography();
        System.out.println(String.format("Wedding service with Photography and Video cost %d", wedServiceWithPhotoAndVideo.getCost()));
    }
}
