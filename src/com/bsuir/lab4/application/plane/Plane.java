package com.bsuir.lab4.application.plane;

import com.bsuir.lab4.application.airport.Airport;

import java.util.concurrent.TimeUnit;

public class Plane implements Runnable{
    private Airport assignedAirport;
    private Integer landingTime;
    private Integer number;
    private Boolean permission = false;
    private Object lock = new Object();
    public Plane(Airport airport, Integer planeNumber)
    {
        assignedAirport = airport;
        number = planeNumber;
        landingTime = 5 + (int)(Math.random() * 15);
    }
    public void givePermission(){
        synchronized (lock) {
            permission = true;
            lock.notifyAll();
        }
    }
    @Override
    public String toString() {
        return "Plane#" + number.toString() + "  " + landingTime.toString() + "s";
    }

    @Override
    public void run() {
        assignedAirport.getLandingPermission(this);
        try {
            synchronized (lock) {
                while (!permission) {
                    lock.wait();
                }
            }
        }
        catch(InterruptedException exception) {

        }
        try {
            TimeUnit.SECONDS.sleep(landingTime);
        }
        catch(InterruptedException exception) {

        }
        assignedAirport.takeOff(this);
    }
}
