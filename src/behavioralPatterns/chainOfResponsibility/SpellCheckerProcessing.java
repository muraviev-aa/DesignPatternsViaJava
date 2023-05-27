package behavioralPatterns.chainOfResponsibility;

public class SpellCheckerProcessing extends ProcessingObject {
    @Override
    protected String handleWork(String text) {
        return text.replaceAll("labda", "lambda");
    }
}
