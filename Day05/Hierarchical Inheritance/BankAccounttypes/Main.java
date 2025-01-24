class BankAccount{
    private int accountNumber;
    private double balance;
    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    //constructor
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    //method to add interest
    public void addInterest(){
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
    //method to display account type
    public void display(){
        System.out.println("Savings Account");
    }
}
class CheckingAccount extends BankAccount{
    private double fee;
    //constructor
    public CheckingAccount(int accountNumber, double balance, double fee){
        super(accountNumber, balance);
        this.fee = fee;
    }
    //method to deduct fee
    public void deductFee(){
        withdraw(fee);
    }
    //method to display account type
    public void display(){
        System.out.println("Checking Account");
    }
}
class FixedDepositAccount extends BankAccount{
    private int period;
    //constructor
    public FixedDepositAccount(int accountNumber, double balance, int period){
        super(accountNumber, balance);
        this.period = period;
    }
    //method to add interest
    public void addInterest(){
        double interest = getBalance() * period * 0.05 / 100;
        deposit(interest);
    }
    //method to display account type
    public void display(){
        System.out.println("Fixed Deposit Account");
    }
}
//MAIN CLASS
public class Main{
    public static void main(String args[]){
        //creating objects
        SavingsAccount sa = new SavingsAccount(101, 5000, 4);
        CheckingAccount ca = new CheckingAccount(102, 2000, 25);
        FixedDepositAccount fa = new FixedDepositAccount(103, 10000, 2);
        //displaying account type
        sa.display();
        //adding interest
        sa.addInterest();
        //displaying account number and balance
        System.out.println("Account Number: " + sa.getAccountNumber());
        
    }
    
}