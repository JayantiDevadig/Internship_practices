import java.util.*;
class   AvgMarks{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int totalMarks;
    double avgMarks;
    System.out.println("enter 3subject marks");
  
    System.out.println("Enter sub1 marks: ");
        int sub1= sc.nextInt();
    System.out.println("Enter sub2 marks: ");
        int sub2 = sc.nextInt();
    System.out.println("Enter sub3 marks: ");
        int sub3 = sc.nextInt();
  
    totalMarks=sub1+sub2+sub3;
    avgMarks=(double) totalMarks/3;
    System.out.println("Total Marks:"+totalMarks);
    System.out.println("Avg Marks:"+avgMarks);
    
        }
  }
