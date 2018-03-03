package com.ghj.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0)
        {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList)
        {
            observer.update(msg);
        }
    }

    public void setMsg(String msg)
    {
        this.msg = msg;

        notifyObservers();
    }
}
