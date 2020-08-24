public class Main {

    public static void main(String[] args) {
        Client clientA = new Client("Jimmy", "Apara");

        Account account1 = new Account(221233,3488.3,clientA);

        account1.deposit(100);

        account1.withdrawal(4000);

        account1.checkBalance(clientA);


    }
}
