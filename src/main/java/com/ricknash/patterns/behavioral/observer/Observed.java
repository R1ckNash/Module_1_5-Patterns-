package com.ricknash.patterns.behavioral.observer;

public interface Observed {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
