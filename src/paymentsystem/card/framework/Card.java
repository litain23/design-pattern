package paymentsystem.card.framework;

import paymentsystem.store.Store;

import java.lang.reflect.InvocationTargetException;

public interface Card {
    public void pay(Store store, long money) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
    public void deposit(long money);
    public void withdraw(long money);
}
