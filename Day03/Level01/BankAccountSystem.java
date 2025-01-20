class BankAccount {
    
    //Attribute to store the values
    static String bankName;
    static int count = 0;
    private String accountHolderName;
    private final int accountNumber;

    // Constructor that initialize the values and increase the count whenever a new account creation is requested
    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        count++;
    }

    // Method to display the total accounts
    static void getTotalAccounts(){
        System.out.println("Total Accounts: " + count);
    }
    // method to display the details
    void displayDetails(){
        System.out.println("Account Holder Name: " + accountHolderName + "\nAccount Number: " + accountNumber);
    }

}

public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 12345);
        BankAccount account2 = new BankAccount("Jane Doe", 67890);
    
        if(account1 instanceof BankAccount) {
            account1.displayDetails();
        }
        if(account2 instanceof BankAccount) {
            account2.displayDetails();
        }
        BankAccount.getTotalAccounts();
    }
}