//10. WAP to check whether a character is uppercase or lowercase     alphabet.





import java.util.Scanner;

class UpperLower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = scanner.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z') {

            System.out.println(ch + " is UPPERCASE alphabet.");

        } else if(ch >= 'a' && ch <= 'z') {

            System.out.println(ch + " is LOWERCASE alphabet.");

        } else {
            
             System.out.println(ch + " is not an alphabet.");

        }

    }
}
