import java.util.*;
class WlFactorial{
      public static void main(String[] args) {
      int num = 10;
        int i =1;
     System.out.println( "Factors of " + num + " are " );
     while(i<=num)
     {
         if(num % i == 0){
          System.out.println(i + " "); 
         }
        i++; 
     }
        
      }
 }