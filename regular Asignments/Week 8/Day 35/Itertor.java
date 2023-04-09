//Write a Java program to iterate through all elements in a array list

import java.util.*;
  public class Itertor {
  public static void main(String[] args) {
  
  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
  color.add("White");
  color.add("Black");
  
  for (String element : color) {
    System.out.println(element);
    }
 }
}