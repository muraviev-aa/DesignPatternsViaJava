package structuralPatterns.adapter;

public class BicyclistRacer implements Bicyclist{
    @Override
    public void bicycleSound() {
        System.out.println("Shih...Shih...Shih.");
    }

    @Override
    public void ride() {
        System.out.println("I'm riding a shot distance.");
    }
}
