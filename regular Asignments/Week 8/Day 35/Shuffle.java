//Write a Java program to shuffle elements in a array list

import java.util.*;
  public class Shuffle {
  public static void main(String[] args) {
  
  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
  color.add("White");
 color.add("Black");
  System.out.println("List before shuffling:\n" + color);  
  Collections.shuffle(color);
  System.out.println("List after shuffling:\n" + color); 
 }
}