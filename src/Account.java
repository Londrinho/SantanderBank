public class Account {

    private double accountNumber;

    private double balance;

    private Client accountHolder;

    public Account() {
    }

    public Account(double accountNumber, double balance, Client accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double sum){
        balance = sum + balance;

        System.out.println("Your deposit was successful. Your new balance is: " + balance);
    }

    public void withdrawal(double cashSum) {
        if (balance >= cashSum){
            balance = balance - cashSum;
            System.out.println("Withdrawal successfully completed. Your new balance is: " + balance);
        } else {
            System.out.println("You have insufficient funds available in your account.");
        }
    }

    public void checkBalance (Client client){

        System.out.println("-------Account Details-------");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Name of account holder: "+ getAccountHolder().getFirstName() + getAccountHolder().getSurName());
        System.out.println("Your current balance is: " + balance);

    }




    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Client accountHolder) {
        this.accountHolder = accountHolder;
    }
}
