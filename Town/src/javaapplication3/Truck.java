/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner; 
/**
 *
 * @author s01214890
 */
public class Truck {
    
    private String name;
    private double maxFuel;
    private double currentFuel;
    private int mpg;
    private Locations current;

    
    
    public Truck(String name, double maxFuel, int mpg, Locations current){
        
        this.name = name;
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
        this.mpg = mpg;
        this.current = current;
                        
    }

    

    public double getX() {
        return current.getxLocation();
    }

    public double getY() {
        return current.getyLocation();
    }
    
    void drive(Locations destination){
         
        double x1, x2, y1, y2, preDis, finalDis;
             x1 = this.getX();
             y1 = this.getY();
             
              //How to get user input from the main file to the class file
              x2 = destination.getxLocation();
              y2 = destination.getyLocation();  
       
             preDis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
          
             //gas used
             finalDis = preDis / 5;
             currentFuel = currentFuel - finalDis;
             
             
             if(destination.isGas()==true){// Locations can not be converted to boolean 
              ReFuel();
              System.out.println("Since this location has gas the truck has automatically refueled :E)");
             }else{
                 System.out.println("This location doesn't have a gas station so refueling wasnt possible");
             }
    
    }
    
    void GoElsewhere( Locations destination){
        
        double x1, x2, y1, y2, preDis, finalDis;
             x1 = this.getX();
             y1 = this.getY();
             
             
              //How to get user input from the main file to the class file
              x2 = destination.getxLocation();
              y2 = destination.getyLocation();  
       
             preDis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
          
             //gas used
             finalDis = preDis / 5;
             currentFuel = currentFuel - finalDis;
             JavaApplication3.Places();
             
             if(destination.isGas()==true){// Locations can not be converted to boolean 
              ReFuel();
              System.out.println("Since this location has gas the truck has automatically refueled :E)");
             }else{
                 System.out.println("This location doesn't have a gas station so refueling wasnt possible");
             }

      }
    public void ReFuel(){
        currentFuel = maxFuel;
        
    }

    public double getMaxFuel() {
        return maxFuel;
        
    }

    public double getCurrentFuel() {
        return currentFuel;
        
    }

    

//    public String getCurrent() {
//        return y + ", " + x;
//    }

 
    
}
