package creationalPatterns.factory1;

public class Notepad extends Book {
    @Override
    public void action() {
        System.out.println("I write down plans in notepad");
    }
}
