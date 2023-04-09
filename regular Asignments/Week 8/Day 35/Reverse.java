//Write a Java program to reverse elements in a array list

import java.util.*;
    class Reverse {
  public static void main(String[] args) {
  
  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
 color.add("Orange");
  color.add("White");
  color.add("Black");
  System.out.println("List before reversing :\n" + color);  
  Collections.reverse(color);
  System.out.println("List after reversing :\n" + color); 
 }
}
