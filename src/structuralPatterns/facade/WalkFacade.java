package structuralPatterns.facade;

public class WalkFacade {
    Hat hat;
    Jacket jacket;
    Pants pants;
    Pullover pullover;
    Shirt shirt;
    Shoes shoes;
    Socks socks;

    public WalkFacade(Hat hat, Jacket jacket, Pants pants, Pullover pullover, Shirt shirt, Shoes shoes, Socks socks) {
        this.hat = hat;
        this.jacket = jacket;
        this.pants = pants;
        this.pullover = pullover;
        this.shirt = shirt;
        this.shoes = shoes;
        this.socks = socks;
    }

    public void getDressed() {
        System.out.println("-----------------------");
        System.out.println("Собираюсь на прогулку: ");
        System.out.println("-----------------------");
        socks.wear();
        shirt.putOn();
        pants.put();
        pullover.dress();
        shoes.dress();
        jacket.dress();
        hat.putOn();
    }

    public void walk() {
        System.out.println("-----------------------");
        System.out.println("Гуляю.");
        System.out.println("-----------------------");
        hat.takeOff();
        hat.putOn();
    }

    public void undress() {
        System.out.println("-----------------------");
        System.out.println("Вернулся с прогулки: ");
        System.out.println("-----------------------");
        hat.takeOff();
        jacket.takeOff();
        shoes.takeOff();
        pullover.takeOff();
        pants.takeOff();
        shirt.takeOff();
        socks.takeOff();
    }
}
