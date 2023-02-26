import java.util.Scanner;
class ArrPosno{
  public static void main(String args[]){
    double a[]=new double[8];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value"
    for(int i=0;i<5;i++){
      a[i]=sc.nextDouble();
    }
System.out.println("array elements");
    for(int i=0;i<5;i++){
    
      if(a[i]>0)
      System.out.println("positive number"+a[i]);
    }
  }
}