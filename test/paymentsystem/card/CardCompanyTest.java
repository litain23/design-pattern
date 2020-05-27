package paymentsystem.card;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import paymentsystem.bank.account.NormalAccount;
import paymentsystem.bank.account.Bank;
import paymentsystem.bank.framework.AccountFactory;
import paymentsystem.card.card.CardCompany;
import paymentsystem.card.framework.Card;
import paymentsystem.person.Person;
import paymentsystem.person.PersonGenerator;
import paymentsystem.store.Store;
import paymentsystem.store.StoreTest;

import java.lang.reflect.InvocationTargetException;

public class CardCompanyTest {
    Person owner;
    NormalAccount account;
    Bank bank;
    CardCompany cardCompany = new CardCompany("신한");
    Card checkCard;
    Store store;


    @BeforeEach
    public void setUp() {
         owner = PersonGenerator.generatePerson("아무개");
         bank = new Bank("신한", 110000000);
         account = (NormalAccount) bank.create(owner, AccountFactory.Type.NORMAL);
         owner.getAccountList().add(account);
         store = new Store(owner, account);
    }

    @Test
    public void When_DepositUsingCard_Expect_BalanceIsSame() {
        checkCard = cardCompany.create(owner, account);
        long depositMoney = 1000;
        checkCard.deposit(depositMoney);
        assertEquals(depositMoney, account.getBalance());
    }

    @Test
    public void When_WithdrawEnoughMoney_Expect_BalanceIsSame() {
        checkCard = cardCompany.create(owner, account);
        long depositMoney = 1000;
        checkCard.deposit(depositMoney);

        depositMoney -= 500;
        checkCard.withdraw(500);

        assertEquals(depositMoney, account.getBalance());
    }

    @Test
    public void When_WithdrawNotEnoughMoney_Expect_IllegalArgumentException() {
        checkCard = cardCompany.create(owner, account);
        long depositMoney = 1000;
        checkCard.deposit(depositMoney);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
    }

    @Test
    public void When_PayStoreEnoughMoney_Expect_StoreAccountIncrease() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, CloneNotSupportedException {
        checkCard = cardCompany.create(owner, account);

        long enoughMoney = 1000000;
        checkCard.deposit(enoughMoney);
        checkCard.pay(store, 1000);

        System.out.println(checkCard.getAccount().getBalance());
    }

    @Test
    public void When_PayStoreNotEnoguthMoney_Expect_IllegalArgumentException() {
        checkCard = cardCompany.create(owner, account);
        long depositMoney = 1000;
        checkCard.deposit(depositMoney);

        assertThrows(IllegalArgumentException.class, () -> {
            checkCard.pay(store, 2000);
        });
    }

}
