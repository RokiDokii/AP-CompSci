public class Account {

    //Instance Variables
    private int accNumber;
    private String name;
    private double balance;
    private double interestRate;
    private boolean goodCredit;

    //Constructors
    //Default Constructor
    public Account(){
        accNumber = 0;
        name = "None";
        balance = 0;
        interestRate = .1;
        goodCredit = false;
    }

    //Parameter Constructor
    public Account(int a, String n, double b, double i, boolean g){
        accNumber = a;
        name = n;
        balance = b;
        interestRate = i;
        goodCredit = g;
    }

    //Behaviors
    //Get Balance
    public double getBalance(){
        return balance;
    }

    //Set Name
    public void setName(String n){
        name = n;
    }

    //Deposit
    public void deposit(double d){
        balance += d;
    }

    //Withdrawal
    public void withdrawal(double w){
        balance -= w;
    }

    //Improve Credit
    public void improveCredit(){
        goodCredit = true;
    }

    //Print Account Info
    public void printInfo(){
        System.out.println("Account Number: "+ accNumber);
        System.out.println("Account Name: "+ name);
        System.out.println("Account Balance: "+ balance);
        System.out.println("Interest Rate: "+ interestRate);
        System.out.println("Good Credit? "+ goodCredit);
    }

}