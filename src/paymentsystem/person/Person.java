package paymentsystem.person;

import paymentsystem.bank.framework.Account;
import paymentsystem.card.framework.Card;

import java.util.List;

public class Person {
    private long id;
    private String name;
    private List<Card> cardList;
    private List<Account> accountList;

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

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
