import java.util.*;
class StringMail{
 
  static void validateString(String str1){
    if(str1.startsWith("L") && str1.endsWith(".com"))
    {
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
   
  }
 
  
  public static void main(String args[]){
  
    validateString("jayanti@gmail@.con");
    
  }
}