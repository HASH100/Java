
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagade
 */
public class sample2 {
    public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("Tom");
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");
  
      //displaying elements
      System.out.println(alist);
   }  
}
    

