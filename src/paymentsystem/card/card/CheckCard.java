package paymentsystem.card.card;

import paymentsystem.bank.account.NormalAccount;
import paymentsystem.store.Store;
import paymentsystem.bank.framework.Account;
import paymentsystem.card.framework.Card;
import paymentsystem.person.Person;
import paymentsystem.transaction.Transaction;

import java.lang.reflect.InvocationTargetException;

public class CheckCard implements Card {
    private Person owner;
    private Account account;

    public CheckCard(Person owner, Account account) {
        this.owner = owner;
        this.account = account;
    }

    @Override
    public void pay(Store store, long money) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        Transaction tx = new Transaction();
        tx.begin();
//        tx.register(account, "withdraw", new Object[]{"123"});
        account.withdraw(money);
        store.saleProduct(money);
        tx.commit();
    }

    @Override
    public void deposit(long money) {
        account.deposit(money);
    }

    @Override
    public void withdraw(long money) {
        account.withdraw(money);
    }

    @Override
    public Account getAccount() {
        return account;
    }


}
