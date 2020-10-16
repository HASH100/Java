/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagade
 */
//THIS IS A SAMPLE PROGRAM
public class light {

    /**
     * @param args the command line arguments
     */
    
        // TODO code apclass Lamp {
    boolean isOn;

    void turnOn() {
        // initialize variable with value true
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    void turnOff() {
        // initialize variable with value false
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
        }



class Main {
    public static void main(String[] args) {
  
        // create objects l1 and l2
        light l1 = new light();
        light l2 = new light();
  
        // call methods turnOn() and turnOff()
        l1.turnOn();
        l2.turnOff();
    }
}
    
    
