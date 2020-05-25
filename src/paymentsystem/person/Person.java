package paymentsystem.person;

import paymentsystem.bank.framework.Account;
import paymentsystem.card.framework.Card;
import paymentsystem.store.Store;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private long id;
    private String name;
    private List<Card> cardList = new ArrayList<>();
    private List<Account> accountList = new ArrayList<>();

    protected Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name +
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void payWithCard(Store store, Card card, long money) {
        card.pay(store, money);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
