package creationalPatterns.factory;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление пиццы PepperoniPizza");
    }

    public void fact() {
        System.out.println("Пицца PepperoniPizza доставлена. Приятного аппетита!");
    }
}
