/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_exercise;

/**
 *
 * @author Bagade
 */
//Write a Java program to get the character at the given index within the String.
public class sample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
    {
        String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " +
            (char)index1);
        System.out.println("The character at position 10 is " +
            (char)index2);
    }
}
    }
    

