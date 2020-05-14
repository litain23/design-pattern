package paymentsystem.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import paymentsystem.bank.account.Account;
import paymentsystem.bank.account.Bank;
import paymentsystem.bank.framework.Factory;
import paymentsystem.person.Person;
import paymentsystem.person.PersonGenerator;

public class BankTest {

    @Test
    public void Make_Account() {
        Person person = PersonGenerator.generatePerson("아무개");

        Bank bank = new Bank("카카오", 570000000);
        Account account = (Account) bank.create(person);

        assertEquals(account, bank.getAccountList().get(0));
    }

    @Test
    public void Make_Account_and_Deposit_Withdraw() {
        Person person = PersonGenerator.generatePerson("아무개");

        Bank bank = new Bank("카카오", 570000000);
        Account account = (Account) bank.create(person);

        account.deposit(1000);
        assertEquals(1000, account.getBalance());

        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    public void Withdraw_Not_Enough_money() {
        Person person = PersonGenerator.generatePerson("아무개");

        Bank bank = new Bank("카카오", 570000000);
        Account account = (Account) bank.create(person);

        account.deposit(1000);
        assertEquals(1000, account.getBalance());
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
    }
}
