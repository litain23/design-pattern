package paymentsystem.card.framework;

import paymentsystem.Store;

public interface Card {
    public void pay(Store store, long money);
    public void deposit(long money);
    public void withdraw(long money);
}
