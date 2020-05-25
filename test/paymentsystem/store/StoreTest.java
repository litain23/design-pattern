package paymentsystem.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import paymentsystem.bank.account.Bank;
import paymentsystem.bank.framework.Account;
import paymentsystem.bank.framework.AccountFactory;
import paymentsystem.card.card.CardCompany;
import paymentsystem.card.framework.Card;
import paymentsystem.person.Person;
import paymentsystem.person.PersonGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StoreTest {
    Person person;
    Person anotherPerson;
    Account account;
    Bank bank;
    Card card;
    CardCompany cardCompany;

    @BeforeEach
    public void setUp() {
        person = PersonGenerator.generatePerson("아무개");
        anotherPerson = PersonGenerator.generatePerson("아무개");
        bank = new Bank("신한", 11000000);

        account = bank.create(person, AccountFactory.Type.NORMAL);
        person.getAccountList().add(account);


        cardCompany = new CardCompany("신한");
        card = cardCompany.create(person, account);

    }

    @Test
    public void When_MakeStore_Expect_Good() {
        Store store = new Store(person, account);
    }

    @Test
    public void When_MakeStoreOtherPersonAccount_Expect_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Store store = new Store(anotherPerson, account);
        });
    }

    @Test
    public void When_SaleProduct_Expect_Good() {
        Store store = new Store(person, account);
        long productPrice = 1000;
        store.saleProduct(productPrice);

        assertEquals(store.getRevenue(), productPrice);
        assertEquals(store.getAccount().getBalance(), productPrice);
    }
}
