package creationalPatterns.factoryMethod;

public class ConcreteCreator extends Creator {
    @Override
    public Product FactoryMethod() {
        return new ConcreteProduct();
    }
}
