package behavioralPatterns.chainOfResponsibility2;

public class DatabaseLogger extends Logger {
    @Override
    protected void performLogging(String message) {
        System.out.println("Сообщение зарегистрировано DatabaseLogger");
    }
}
