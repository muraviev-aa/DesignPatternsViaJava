package creationalPatterns.factory;

public abstract class Pizza {
    public abstract void prepare();

    public void bake() {
        System.out.println("Процесс выпекания");
    }

    public void cut() {
        System.out.println("Пицца нарезана");
    }

    public void box() {
        System.out.println("Пицца упакована");
    }

    abstract void fact();
}
