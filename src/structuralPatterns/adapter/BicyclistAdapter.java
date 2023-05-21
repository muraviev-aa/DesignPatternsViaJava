package structuralPatterns.adapter;

public class BicyclistAdapter implements Biker{
    Bicyclist bicyclist;

    public BicyclistAdapter(Bicyclist bicyclist) {
        this.bicyclist = bicyclist;
    }

    @Override
    public void motorSound() {
        bicyclist.bicycleSound();
    }

    @Override
    public void ride() {
        for (int i = 0; i < 3; i++) {
            bicyclist.ride();
        }
    }
}
