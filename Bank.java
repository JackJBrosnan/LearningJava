import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;
    private static int latestAccount;

    Bank() { /*A new bank is defined with a list of bank accounts and a value that keeps track of the account number of the 
			 most recently added account*/
        this.accounts = new ArrayList<Account>();
        Bank.latestAccount = -1;
    }

    public int login() {
    /*This method should ask the user to give their account number and password, returning the account number if they match, 
	or returning -1 if not*/
        System.out.println("Enter account number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Account account = accounts.get(number);
        System.out.println("Enter password");
        String password = Console.readLine();
        if(account.checkPassword(password)==true){
            return account.getNumber();
        }
        return -1;
    }

    public void deposit(int number) {
    /*This method should ask the user how much money they want to deposit into their account, and correctly update the
	balance of their account*/
        Account account = accounts.get(number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount");
        int number2 = scanner.nextInt();
        int number1 = (int) account.getBalance();
        account.setBalance(number2+number1);
    }

    public void withdraw(int number) {
    /*This method should ask the user how much money they want to withdraw from their account, and correctly update 
	the balance of their account*/
        Account account = accounts.get(number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter withdrawl amount");
        int number2 = scanner.nextInt();
        int number1 = (int) account.getBalance();
        account.setBalance(number1-number2);
    }

    public void checkBalance(int number) {
        //This method should display a message telling the user how much money is in their account
        Account account = accounts.get(number);
        System.out.println("Your balance is: £"+ account.getBalance());
    }

    public void addAccount() {
    /*This method should create a new account with an account number 1 larger than the account number or the last account 
	created, a password given by the user, and a balance of 0. The account should be added to the bank's list of accounts*/
        latestAccount = latestAccount + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password for your account");
        String password = scanner.nextLine();
        accounts.add(new Account(latestAccount,password,0.0f));
        System.out.println("Your account number is:"+latestAccount);
    }
}