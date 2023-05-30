package creationalPatterns.factoryMethod;

public class ConcreteProduct extends Product {
    public ConcreteProduct() {
        System.out.println(this.hashCode());
    }
}
