package behavioralPatterns.chainOfResponsibility;

public abstract class ProcessingObject {
    protected ProcessingObject successor;

    public void setSuccessor(ProcessingObject successor) {
        this.successor = successor;
    }

    protected abstract String handleWork(String text);

    public String handle(String input) {
        String str = handleWork(input);
        if (successor != null) {
            return successor.handle(str);
        }
        return str;
    }
}
