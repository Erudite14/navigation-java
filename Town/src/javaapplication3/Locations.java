/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author s01214890
 */
public class Locations {
    
    String name;
    double xLocation;
    double yLocation;
    boolean gas;
    
    public Locations(String name, double xLocation, double yLocation, boolean gas){
        this.name = name;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.gas = gas;
    }

    public String getLocation() {
        return name;
    }

    public double getxLocation() {
        return xLocation;
    }

    public double getyLocation() {
        return yLocation;
    }

    public boolean isGas() {
        return gas;
    }
    
    
}
