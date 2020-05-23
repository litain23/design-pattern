package paymentsystem.bank.framework;

import paymentsystem.person.Person;

public abstract class AccountFactory {
    public enum Type {
        NORMAL, MINUS
    }


    public final Account create(Person owner, Type type) {
        Account p = createProduct(owner, type);
        registerProduct(p);
        return p;
    }

    protected abstract Account createProduct(Person owner, Type type);
    protected abstract void registerProduct(Account p);
}
