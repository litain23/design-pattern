package paymentsystem.bank.account;

import paymentsystem.bank.framework.Account;
import paymentsystem.person.Person;

public class NormalAccount implements Account {
    private Person owner;
    private long balance;
    private long accountNumber;
    private String bankName;

    public NormalAccount(Person owner, long accountNumber, String bankName) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = 0;
    }

    @Override
    public void deposit(long money) {
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

    @Override
    public long getBalance() {
        return balance;
    }

    @Override
    public Person getOwner() {
        return owner;
    }
}
