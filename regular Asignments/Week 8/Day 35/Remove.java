//Write a Java program to remove the third element from a array list
import java.util.*;
   class Remove{
  public static void main(String[] args) {

  List<String> color = new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
  color.add("White");
 color.add("Black");
  
  System.out.println(color);
  color.remove(2);
 
  System.out.println("After removing third element from the list:\n"+color);
 }
  }