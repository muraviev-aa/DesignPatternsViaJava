package behavioralPatterns.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        ProcessingObject p1 = new HeaderTextProcessing();
        ProcessingObject p2 = new SpellCheckerProcessing();
        p1.setSuccessor(p2);
        String result = p1.handle("Aren't labdas really sexy?");
        System.out.println(result);
    }
}
