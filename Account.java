import java.util.Objects;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String accountPassword;
    private float accountBalance;

    //A new bank account should be defined with a given account number, password and balance
    Account (int number, String password, float balance) {
        this.accountNumber = number;
        this.accountPassword = password;
        this.accountBalance = balance;
    }

    public int getNumber() {
        return accountNumber;
    }

    public boolean checkPassword(String password) {
        return Objects.equals(password, accountPassword);
    }

    public float getBalance() {
        return accountBalance;
    }

    public void setBalance(float newBalance) {
        accountBalance = newBalance;
    }
}