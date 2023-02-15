//1. WAP to find maximum between two numbers.

import java.util.Scanner;

class MaxNumber{
  public static void main(String args[]){
    int firstNumber,secnodNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    firstNumber=sc.nextInt();
    System.out.println("enter second number");
    secnodNumber=sc.nextInt();
    if(firstNumber>secnodNumber)
      System.out.println("first number is maximum number");
    else{
      System.out.println("second number is maximum number");
      
    }
  }
}