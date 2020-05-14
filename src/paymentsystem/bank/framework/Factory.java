package paymentsystem.bank.framework;

import paymentsystem.person.Person;

public abstract class Factory {
    public final Product create(Person owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(Person owner);
    protected abstract void registerProduct(Product p);
}
