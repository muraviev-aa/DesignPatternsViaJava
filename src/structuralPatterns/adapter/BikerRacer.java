package structuralPatterns.adapter;

public class BikerRacer implements Biker{
    @Override
    public void motorSound() {
        System.out.println("Drrr...Drrr...Drrr!");
    }

    @Override
    public void ride() {
        System.out.println("I'm riding!");
    }
}
