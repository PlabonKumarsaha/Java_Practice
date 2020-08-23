package com.pks.designPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer>observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();


    }


    @Override
    public void register(Observer newObserver) {


        observers.add(newObserver);

    }

    @Override
    public void unRegister(Observer deleteObserver) {

        int observerIndexToDelete = observers.indexOf(deleteObserver);
        System.out.println("The following "+ observers.get(observerIndexToDelete) +"was deleted");
        observers.remove(observerIndexToDelete);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer : observers){
            observer.update(ibmPrice,applePrice,googlePrice);


        }
    }
    public void setIBMPrice(double newPrice){
        this.ibmPrice = newPrice;
        notifyObserver();
    }

    public void setApplePrice(double newPrice){
        this.applePrice = newPrice;
        notifyObserver();
    }
    public void setGooglePrice(double newPrice){
        this.googlePrice  = newPrice;
        notifyObserver();
    }
}
