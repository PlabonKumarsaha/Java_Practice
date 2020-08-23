package com.pks.designPattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private  static int observerIdTracker = 0;
    private int observerId;
    private Subject stockGrabber;
    public StockObserver(Subject subject){

        this.stockGrabber =subject;
        this.observerId = ++observerIdTracker;
        System.out.println("New observer "+this.observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {

        this.ibmPrice =ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
    }

    public void printThePrice(){
        System.out.println("IMB price"+ibmPrice+" Apple price "+applePrice+ " google price"+googlePrice);

    }
}
