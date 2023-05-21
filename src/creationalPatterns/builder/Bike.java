package creationalPatterns.builder;

import java.time.LocalDate;

public class Bike {
    private String size;
    private String color;
    private LocalDate created;
    private int numberOfWheels;
    private boolean bikeTrunk;
    private boolean foldingFrame;
    private boolean speedShifter;

    static class Builder {
        private String size;
        private String color;
        private LocalDate created;
        private int numberOfWheels;
        private boolean bikeTrunk;
        private boolean foldingFrame;
        private boolean speedShifter;

        Builder buildSize(String size) {
            this.size = size;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
            return this;
        }

        Builder buildBikeTrunk(boolean bikeTrunk) {
            this.bikeTrunk = bikeTrunk;
            return this;
        }

        Builder buildFoldingFrame(boolean foldingFrame) {
            this.foldingFrame = foldingFrame;
            return this;
        }

        Builder buildSpeedShifter(boolean speedShifter) {
            this.speedShifter = speedShifter;
            return this;
        }

        Bike build() {
            Bike bike = new Bike();
            bike.size = size;
            bike.color = color;
            bike.created = created;
            bike.numberOfWheels = numberOfWheels;
            bike.bikeTrunk = bikeTrunk;
            bike.foldingFrame = foldingFrame;
            bike.speedShifter = speedShifter;
            return bike;
        }
    }

    @Override
    public String toString() {
        return "Bike{"
                + "size='" + size + '\''
                + ", color='" + color + '\''
                + ", created=" + created
                + ", numberOfWheels=" + numberOfWheels
                + ", bikeTrunk=" + bikeTrunk
                + ", foldingFrame=" + foldingFrame
                + ", speedShifter=" + speedShifter
                + '}';
    }

    public static void main(String[] args) {
        Bike bike = new Builder()
                .buildSize("adult")
                .buildColor("red")
                .buildCreated(LocalDate.of(1991, 2, 25))
                .buildNumberOfWheels(2)
                .buildBikeTrunk(true)
                .buildFoldingFrame(false)
                .buildSpeedShifter(false)
                .build();
        System.out.println(bike);

        Bike bike1 = new Builder()
                .buildSize("children")
                .buildColor("yellow")
                .buildNumberOfWheels(3)
                .build();
        System.out.println(bike1);
    }
}
