public class Main {
  public static void main(String[] args) {
    Account account1 = new Account();
    Account account2 = new Account(1234, "John Doe", 100.00, 0.05, false);
    System.out.println(account1.getBalance());
    System.out.println(account2.getBalance());
    account1.setName("Jane Doe");
    account1.deposit(250);
    account2.withdrawal(50);
    account2.improveCredit();
    account1.printInfo();
    account2.printInfo();
  }
}