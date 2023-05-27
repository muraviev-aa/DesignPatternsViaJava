package behavioralPatterns.chainOfResponsibility2;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger databaseLogger = new DatabaseLogger();

        consoleLogger.setNext(fileLogger);
        fileLogger.setNext(databaseLogger);
        consoleLogger.logMessage("Запишите это сообщение в журнал");
    }
}
