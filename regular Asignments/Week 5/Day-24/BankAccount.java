public class BankAccount {
  int balance;
  int account_number;
  public void deposit(int amount) {
    balance = balance + amount;
  }
  public void withdraw(int amount) {
    balance = balance - amount;
  }
  public void display() {
    System.out.println("Balance is: " + balance);
  }
  public static void main(String[] args) {
    BankAccount obj = new BankAccount();
    obj.balance = 1008;
    obj.account_number = 129045;

    obj.deposit(590);
    obj.withdraw(500);
    obj.display();

  }

}