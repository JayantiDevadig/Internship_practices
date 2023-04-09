//Write a Java program to update specific array element by given element

import java.util.*;
  class Update {
  public static void main(String[] args) {
  
  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
 color.add("White");
color.add("Black");

  color.set(2, "Yellow");
   
  System.out.println(color);
 }
}