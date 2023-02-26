import java.util.Scanner;
class ArrayDemo2{
  public static void main(String args[]){
    //declare variable
    double arr[]=new double[4];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    //read data
    for(int i=0;i<4;i++){
    arr[i]=sc.nextDouble();
    }
    //display data
    for(int i=0;i<4;i++){
      //System.out.println(arr[i]);

          System.out.println("arr["+i+"]="+arr[i]);
    }
  }
}