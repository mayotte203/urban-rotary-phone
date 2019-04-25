package com.bsuir.lab4.application.model;

import com.bsuir.lab4.application.airport.Airport;
import com.bsuir.lab4.application.plane.Plane;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Model {
    private Integer planeCounter = 0;
    private Airport airport = new Airport();
    private List<Thread> planesThreadsList = new LinkedList<>();
    public Model(){
    }
    List<Plane> planesList = new LinkedList<Plane>();
    public void addPlaneToQueue(){
        Plane plane = new Plane(airport, planeCounter);
        Thread planeThread = new Thread(plane);
        planeCounter++;
        planesList.add(plane);
        planesThreadsList.add(planeThread);
        planeThread.start();
    }
    public List<Plane> getPlanesQueue(){
        return airport.getPlanesQueue();
    }
    public List<Plane> getLandedPlanes(){
        return airport.getLandedPlanes();
    }
}
