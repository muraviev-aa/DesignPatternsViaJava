package creationalPatterns.fabrica;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Приготовление пиццы ClamPizza");
    }

    public void fact() {
        System.out.println("Пицца ClamPizzaPizza доставлена. Приятного аппетита!");
    }
}
