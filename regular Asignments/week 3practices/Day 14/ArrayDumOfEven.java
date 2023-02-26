import java.util.Scanner;

class ArrSumOfEven {
  public static void main(String args[]) {
    // declare varaible
    int a[] = new int[5];
    int evenSum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter values");
    // read data
    for (int i = 0; i < 5; i++) {
      a[i] = sc.nextInt();
    }

    // print sum
    System.out.println("****** evensum of Array Elements******");
    for (int i = 0; i < 5; i++) {
      if (a[i] % 2 == 0)
        evenSum = evenSum + a[i];
    }
    System.out.println("evensum");

  }
}