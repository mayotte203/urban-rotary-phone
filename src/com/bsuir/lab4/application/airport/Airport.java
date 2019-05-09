package com.bsuir.lab4.application.airport;

import com.bsuir.lab4.application.plane.Plane;

import java.util.LinkedList;
import java.util.List;

public class Airport{
    private Integer maxLandedPlanes = 5;
    private List<Plane> planesQueue = new LinkedList<Plane>();
    private List<Plane> landedPlanes = new LinkedList<Plane>();
    public List<Plane> getPlanesQueue(){
        return planesQueue;
    }
    public List<Plane> getLandedPlanes(){
        return landedPlanes;
    }
    public synchronized void getLandingPermission(Plane plane){
        planesQueue.add(plane);
        proceedQueue();
    }
    public synchronized void takeOff(Plane plane){
        landedPlanes.remove(plane);
        proceedQueue();
    }
    public void proceedQueue(){
        while(landedPlanes.size() < maxLandedPlanes && planesQueue.size() > 0){
            landedPlanes.add(planesQueue.get(0));
            planesQueue.get(0).givePermission();
            planesQueue.remove(0);
        }
    }
}
