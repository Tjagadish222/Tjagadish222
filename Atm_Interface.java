import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial account balance: $");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(initialBalance);

        ATM atm  = new ATM(bankAccount);

        while (true) {
            atm.displayMenu();
            System.out.println("Select an option: ");
            int choice = scanner.nextInt();

            atm.performTransaction(choice, scanner);
            
        }

    }

}
