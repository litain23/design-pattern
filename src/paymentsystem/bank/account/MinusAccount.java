package paymentsystem.bank.account;

import paymentsystem.bank.framework.Account;
import paymentsystem.person.Person;

public class MinusAccount implements Account {
    private Person owner;
    private long balance;
    private long accountNumber;
    private String bankName;

    public MinusAccount(Person owner, long accountNumber, String bankName) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = 0;
    }
    @Override
    public void deposit(long money) {

    }

    @Override
    public long withdraw(long money) {
        return 0;
    }

    @Override
    public long getBalance() {
        return 0;
    }

    @Override
    public Person getOwner() {
        return null;
    }
}
