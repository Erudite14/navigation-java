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
//import java.lang.Math;
import java.util.Scanner; 
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    int userInput;
    int YorN;
     
       //Truck1().
    
       Locations[] LocationsArray = new Locations[7];
        
       LocationsArray[0] = new Locations ("Cleveland", 0.0, 0.0,true);
       LocationsArray[1] = new Locations ("North Pole", 500.0, -100.0,false);
       LocationsArray[2] = new Locations ("Campbell Hill", -50.0, -50.0,false);
       LocationsArray[3] = new Locations ("Tokyo", -100.0, 1000.0,true);
       LocationsArray[4] = new Locations ("Chicago", -200.0, 75.0,true);
       LocationsArray[5] = new Locations ("Erie PA", 150.0, 0.0,true);
       LocationsArray[6] = new Locations ("Allegheny Nation Forest", 300.0, -75.0, false); 
       //Truck constrcutor
       Truck Truck1 = new Truck("Big-Red", 100.0, 20,LocationsArray[0]);
         
         
       do{
        System.out.println("You are now in " + LocationsArray[0].getLocation());
        System.out.println("your corrdinates are " + Truck1.getX() + " , " + Truck1.getY());
        System.out.println("Where would you like to go?");
        Places();
        userInput = input.nextInt();
        //( LocationsArray[userInput].isGas() == true)
            
     
        Truck1.drive(LocationsArray[userInput]);
        System.out.println("You now have " + Truck1.getCurrentFuel() + "/ " + Truck1.getMaxFuel() + " fuel left" );
        System.out.println("You are now in " + LocationsArray[userInput].getLocation());
        System.out.println("Would you like to go somewhere else?");
        YesOrNoPrintStatments();
        YorN = input.nextInt();
        System.out.println("would like to go somewhere else?");
        System.out.println("Yes: 1 OR No: 0");
       }while(YorN == 1);
        
        
        
    }
    
    
        static void Places(){
         System.out.println("--------------------------------");
         System.out.println("North pole: 1");
         System.out.println("Campbell Hill: 2");
         System.out.println("Tokyo: 3");
         System.out.println("Chicago: 4");
         System.out.println("Erie PA: 5 ");
         System.out.println("Allegheny Nation Forest: 6");
         System.out.println("---------------------------------");
         }
        
        static void YesOrNoPrintStatments(){
            System.out.println("Yes: 1");
            System.out.println("No: 0");
        }
        
        

}