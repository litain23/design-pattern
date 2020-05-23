package paymentsystem.bank.account;
import paymentsystem.bank.framework.AccountFactory;
import paymentsystem.bank.framework.Account;
import paymentsystem.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Bank extends AccountFactory {
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
    protected Account createProduct(Person owner, Type type) {
        accountNumber++;
        switch (type) {
            case NORMAL:
                return new NormalAccount(owner, id + accountNumber, name);
            case MINUS:
                return new MinusAccount(owner, id + accountNumber, name);
            default:
                return new NormalAccount(owner, id + accountNumber, name);
        }
    }

    @Override
    protected void registerProduct(Account p) {
        accountList.add((NormalAccount)p);
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
