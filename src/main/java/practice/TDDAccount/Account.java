package practice.TDDAccount;

public class Account {
    private int balance;

    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }
}
