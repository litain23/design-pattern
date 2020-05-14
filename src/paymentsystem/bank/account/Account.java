package paymentsystem.bank.account;


import paymentsystem.bank.framework.Product;
import paymentsystem.person.Person;

public class Account implements Product {
    private Person owner;
    private long balance;
    private long accountNumber;
    private String bankName;

    public Account(Person owner, long accountNumber, String bankName) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = 0;
    }

    @Override
    public void deposit(int money) {
        balance += money;
    }

    @Override
    public long withdraw(long money) {
        if(balance < money) {
            throw new IllegalArgumentException("Not enough money to withdraw");
        }
        balance -= money;
        return money;
    }

    public long getBalance() {
        return balance;
    }

    public Person getOwner() {
        return owner;
    }
}
