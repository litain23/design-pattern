package paymentsystem.card.card;

import paymentsystem.Store;
import paymentsystem.bank.framework.Account;
import paymentsystem.card.framework.Card;
import paymentsystem.person.Person;

public class CheckCard implements Card {
    private Person owner;
    private Account account;

    public CheckCard(Person owner, Account account) {
        this.owner = owner;
        this.account = account;
    }

    @Override
    public void pay(Store store, long money) {
        account.withdraw(money);
        // transactional ? 필요
        // store.account.deposit(money);
    }

    @Override
    public void deposit(long money) {
        account.deposit(money);
    }

    @Override
    public void withdraw(long money) {
        account.withdraw(money);
    }


}
