package behavioralPatterns.strategy;

public class Paint {
    private final Shape shape;

    public Paint(Shape s) {
        this.shape = s;
    }

    public void draw() {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint triangle = new Paint(new Triangle());
        triangle.draw();
        Paint square = new Paint(new Square());
        square.draw();
    }
}
