import java.util.Scnnaer;
class AEvenNo{
  public static void main(String args[]){
    int arr[]=new arr[6];
    Scanner sc=new Scanner(System.in);
      //read data
    for(int i=0;i<5;i++){
     arr[i]=sc.nextInt();
   }
    
    //print even  numbers
    System.out.println("******Array Elements******");
    for(int i=0;i<5;i++){
      if(arr[i]%2==0){
        System.out.println(arr[i]);
      }
      
    }
  }
}
