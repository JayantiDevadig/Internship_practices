//Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.*;
  class Retrive {
  public static void main(String[] args) {
  
  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
  color.add("White");
  color.add("Black");
  
  System.out.println(color);
  
  String element = color.get(0);
  System.out.println("First element: "+element);
  element = color.get(2);
  System.out.println("Third element: "+element);
 }
}
