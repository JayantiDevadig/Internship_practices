import java.util.Scanner;
class ArrayDemo{
  //insert
  static void insert(int size,int arr[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
  }
  //display
  static int[] display(int n,int abc[]){
     return abc;
    
  }
  
  public static void main(String args[]){
    
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    n=sc.nextInt();
    int a[]=new int[n];
    insert(n,a);
    int b[]=display(n,a);
    System.out.println("elements are");
    for(int i=0;i<n;i++){
      System.out.println(b[i]);
        
    }
  }
}