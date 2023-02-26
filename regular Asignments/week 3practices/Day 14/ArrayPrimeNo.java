import java.util.Scanner;
class ArrayPrimeNo{
  public static void main(String args[]){
    //declare varaible
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    //read data
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
   }
    //check all array elements
    System.out.println("prime numbers");
    for(int i=0;i<5;i++){
       //to check prime number or not
      int count=0;
      for(int j=2;j<=a[i]/2;j++){
        if(a[i]%j==0){
          count++;
        }
      }
      if(count==0){
        System.out.println(a[i]);
      }    
    }
  
      
    
  }
}