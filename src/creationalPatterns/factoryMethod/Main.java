package creationalPatterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.FactoryMethod();
        creator.AnOperation();
    }

}
