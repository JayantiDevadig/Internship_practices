//Write a Java program to sort a given array list

import java.util.*;
   class Sort {
  public static void main(String[] args) {
  
  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
  color.add("White");
 color.add("Black");
  System.out.println("List before sort: "+color);
  Collections.sort(color);
  System.out.println("List after sort: "+color);    
 }
}