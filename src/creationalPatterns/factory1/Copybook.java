package creationalPatterns.factory1;

public class Copybook extends Book {
    @Override
    public void action() {
        System.out.println("I record what happened during the day in copybook");
    }
}
