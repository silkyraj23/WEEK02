public class BankAccount  {
    //declaring the attributes of the class
    String accountHolder;
    int accountNumber;
    int balance;

    // Constructor to initialize the parameters of the class
    BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Desposit money method of the class
    void deposit(int amount) {
        balance += amount;
        System.out.println("Balance after deposit "+ amount + " is "+ balance);

    }

    // Withdrawing money only if sufficient balance exists
    void withdraw(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance after withdraw "+ amount + " is "+ balance);
        }
    }

    // Displaying the current balance.
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    //main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount("shamiksha pandey" , 335353423,60000 );
        account.displayBalance();
        account.deposit(2900);
        account.withdraw(100);
    }
}

