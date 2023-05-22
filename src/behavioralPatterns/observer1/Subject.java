package behavioralPatterns.observer1;

public interface Subject {
    void registerObserver(Observer o);

    void notifyObservers(String tweet);
}
