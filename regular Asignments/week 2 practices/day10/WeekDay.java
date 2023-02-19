import java.util.Scanner;
class WeekDay{
  public static void main(String args[]){ 
    int number;
    System.out.println("enter any number 1-7");
  Scanner sc=new Scanner(System.in) ;
    number=sc.nextInt();
  switch(number){
      
  
    case 1:
      System.out.println("Monday");
      break;
    case 2:
      System.out.println("tuesday");
    break;
    case 3:
      System.out.println("wednesday");
    break;
    case 4:
      System.out.println("thursday");
    break;
    case 5:
    System.out.println("Friday");
    break;
    case 6:
      System.out.println("Saturday");
    break;

    case 7:
      System.out.println("Sunday");
    break;
      default:
        System.out.println("invalid operation");
    
    
  }
}
}