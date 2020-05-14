package paymentsystem.bank.account;
import paymentsystem.bank.framework.Factory;
import paymentsystem.bank.framework.Product;
import paymentsystem.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Bank extends Factory {
    private List<Account> accountList = new ArrayList<>();
    private List<String> transactionList = new ArrayList<>();
    private String name;
    private long id;
    private long accountNumber = 0;

    public Bank(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    protected Product createProduct(Person owner) {
        accountNumber++;
        return new Account(owner, id + accountNumber, name);
    }

    @Override
    protected void registerProduct(Product p) {
        accountList.add((Account)p);
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
