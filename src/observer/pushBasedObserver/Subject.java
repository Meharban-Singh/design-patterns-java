package observer.pushBasedObserver;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    /**
     * Adds another observer to the list of observers
     *
     * @param obs
     */
    public void addObserver(Observer obs) {
        this.observers.add(obs);
    }

    /**
     * Removes an observer from the list of observers.
     *
     * @param obs
     */
    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    /**
     * Notifies all the observers of the changes
     */
    public void notifyObservers(int value) {
        for(Observer obs: observers)
            obs.update(value);
    }
}
