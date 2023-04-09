//Write a Java program to create a new array list, add some colors (string) and print out the collection

import java.util.*;
 class Colors {
  public static void main(String[] args) {
  List<String> color= new ArrayList<String>();
  color.add("Red");
  color.add("Green");
  color.add("Orange");
  color.add("White");
  color.add("Black");
  System.out.println(color);
 }
   for( String str: color){
   System.out.println(str);
   
   }
}
