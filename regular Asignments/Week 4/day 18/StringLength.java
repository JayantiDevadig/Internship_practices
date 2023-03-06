import java.util.*;
class StringLength{
 
  static void checkSubStrings(String str1, String subString){
    if(str1.contains(subString)){
      System.out.println(subString.length());
    }
    else{
      System.out.println("not valid");
    }
  }
  public static void main(String args[]){
      Scanner sc=new Scanner (System.in);
    String subString;
    System.out.println("enter astring");
    String str=sc.nextLine();
    subString=sc.nextLine();
    checkSubStrings(str,subString);
  }
}