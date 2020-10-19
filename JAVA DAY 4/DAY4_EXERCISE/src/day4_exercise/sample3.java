/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_exercise;

/**
 *
 * @author Bagade
 */
public class sample3 {
    
     public static void main(String args[])
     {
          int a = 0;
          int b = 1;
          int max = 50;
          int fib = 1;
          System.out.print("Fibonacci series is: "+a);
          while ( fib <= max )
          {
               System.out.print("  "+fib);
               fib = a+b;
               a = b;
               b = fib;
          }
     }
}
    

