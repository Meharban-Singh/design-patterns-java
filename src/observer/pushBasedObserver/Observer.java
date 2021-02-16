package observer.pushBasedObserver;

// Observers push the change to the Subject
public interface Observer {
    void update(int value);
}
