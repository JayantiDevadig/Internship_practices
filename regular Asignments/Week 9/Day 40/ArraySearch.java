import java.util.Scnner;
class ArraySearch{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the size of array")
    int n=sc.nextInt();
    int arr[]={1,6,7,8,6,5};
    System.out.println("search");
    int searchElement=sc.nextInt();
    for(int i=0;i<n;i++){
    if(arr[i]==SearchElement) {
      System.out.println("element found"+arr[i])
    } 
    }
   
  }
  
}