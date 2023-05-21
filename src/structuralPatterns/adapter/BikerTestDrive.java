package structuralPatterns.adapter;

public class BikerTestDrive {
    public static void main(String[] args) {
        BikerRacer bikerRacer = new BikerRacer();
        BicyclistRacer bicyclistRacer = new BicyclistRacer();
        Biker bikerAdapter = new BicyclistAdapter(bicyclistRacer);

        System.out.println("BicyclistRacer: ");
        bicyclistRacer.bicycleSound();
        bicyclistRacer.ride();
        System.out.println("-------------------");
        System.out.println("BikerRacer: ");
        testBike(bikerRacer);
        System.out.println("-------------------");
        System.out.println("BicyclistAdapter");
        testBike(bikerAdapter);
    }

    static void testBike(Biker biker) {
        biker.motorSound();
        biker.ride();
    }
}
