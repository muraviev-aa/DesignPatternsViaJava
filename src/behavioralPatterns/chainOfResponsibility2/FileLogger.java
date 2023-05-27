package behavioralPatterns.chainOfResponsibility2;

public class FileLogger extends Logger {
    @Override
    protected void performLogging(String message) {
        System.out.println("Сообщение зарегистрировано FileLogger");
    }
}
