package observer;

import java.util.ArrayList;
import java.util.List;

public class Agricultura implements Subject {
    private List<Observer> observers;
    private float massaSeca;
    private float massaUmida;

    public Agricultura() {
        observers = new ArrayList<>();
    }

    public void setMedicoes(float massaSeca, float massaUmida) {
        this.massaSeca = massaSeca;
        this.massaUmida = massaUmida;

        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);        
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > -1) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(massaSeca, massaUmida);
        }
    }
    
}
