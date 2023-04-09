//Write a Java program to search an element in a array list.

import java.util.*;
   class Search {
  public static void main(String[] args) {
  
  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
 color.add("White");
color.add("Black");
  
    if (color.contains("Red")) {
    System.out.println("Found the element");
    } else {
    System.out.println("There is no such element");
    }
 }