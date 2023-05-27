package behavioralPatterns.chainOfResponsibility;

public class HeaderTextProcessing extends ProcessingObject {
    @Override
    protected String handleWork(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }
}
