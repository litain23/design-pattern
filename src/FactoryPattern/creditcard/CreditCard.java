package FactoryPattern.creditcard;

import FactoryPattern.framework.Product;

public class CreditCard implements Product {
    private String owner;

    public CreditCard(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println(owner + " creditCard used");
    }
}
