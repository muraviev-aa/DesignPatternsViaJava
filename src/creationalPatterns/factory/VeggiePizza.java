package creationalPatterns.factory;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление пиццы VeggiePizza");
    }

    public void fact() {
        System.out.println("Пицца VeggiePizza доставлена. Приятного аппетита!");
    }
}
