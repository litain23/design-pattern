package paymentsystem.card.framework;

import paymentsystem.bank.account.NormalAccount;
import paymentsystem.bank.framework.Account;
import paymentsystem.person.Person;

import java.util.List;

public abstract class CardFactory {
    public final Card create(Person owner, Account account) {
        Card p = createProduct(owner, account);
        registerProduct(p);
        return p;
    }

    protected abstract Card createProduct(Person owner, Account account);
    protected abstract void registerProduct(Card p);
    protected abstract List<Card> getCardList();
}
