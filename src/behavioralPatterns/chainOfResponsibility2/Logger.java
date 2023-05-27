package behavioralPatterns.chainOfResponsibility2;

public abstract class Logger {
    private Logger nextLoggerInChain;

    public void setNext(Logger logger) {
        nextLoggerInChain = logger;
    }

    abstract protected void performLogging(String message);

    public void logMessage(String message) {
        performLogging(message);
        if (nextLoggerInChain != null) {
            nextLoggerInChain.logMessage(message);
        }
    }
}
