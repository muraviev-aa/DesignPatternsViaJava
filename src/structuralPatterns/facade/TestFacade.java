package structuralPatterns.facade;


public class TestFacade {
    public static void main(String[] args) {
        /* Создание экземпляров компонентов */
        Hat hat = new Hat();
        Jacket jacket = new Jacket();
        Pants pants = new Pants();
        Pullover pullover = new Pullover();
        Shirt shirt = new Shirt();
        Shoes shoes = new Shoes();
        Socks socks = new Socks();
        /* Создаем фасад со всеми компонентами подсистемы */
        WalkFacade walkFacade = new WalkFacade(hat, jacket, pants, pullover, shirt, shoes, socks);
        /* Используем упрощенный интерфейс */
        walkFacade.getDressed();
        walkFacade.walk();
        walkFacade.undress();
    }
}
