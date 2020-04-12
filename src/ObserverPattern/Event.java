package ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Event {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserve(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while(it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }

    public abstract String getEventType();
    public abstract void execute();
    public abstract int getCnt();

}
