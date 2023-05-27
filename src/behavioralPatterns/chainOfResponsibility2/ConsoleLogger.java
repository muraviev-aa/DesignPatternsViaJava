package behavioralPatterns.chainOfResponsibility2;

public class ConsoleLogger extends Logger {
    @Override
    protected void performLogging(String message) {
        System.out.println("Сообщение зарегистрировано ConsoleLogger");
    }
}
