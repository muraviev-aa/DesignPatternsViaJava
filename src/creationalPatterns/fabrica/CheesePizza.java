package creationalPatterns.fabrica;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление пиццы CheesePizza");
    }

    public void fact() {
        System.out.println("Пицца CheesePizza доставлена. Приятного аппетита!");
    }
}
