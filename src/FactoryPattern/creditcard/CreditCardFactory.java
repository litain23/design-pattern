package FactoryPattern.creditcard;

import FactoryPattern.framework.Factory;
import FactoryPattern.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class CreditCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new CreditCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((CreditCard)p).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
