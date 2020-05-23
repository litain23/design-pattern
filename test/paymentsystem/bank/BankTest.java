package paymentsystem.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import paymentsystem.bank.account.NormalAccount;
import paymentsystem.bank.account.Bank;
import paymentsystem.bank.framework.AccountFactory;
import paymentsystem.person.Person;
import paymentsystem.person.PersonGenerator;

public class BankTest {

    @Test
    public void Make_Account() {
        Person person = PersonGenerator.generatePerson("아무개");

        Bank bank = new Bank("카카오", 570000000);
        NormalAccount account = (NormalAccount) bank.create(person, AccountFactory.Type.NORMAL);

        assertEquals(account, bank.getAccountList().get(0));
    }

    @Test
    public void Make_Account_and_Deposit_Withdraw() {
        Person person = PersonGenerator.generatePerson("아무개");

        Bank bank = new Bank("카카오", 570000000);
        NormalAccount account = (NormalAccount) bank.create(person, AccountFactory.Type.NORMAL);

        account.deposit(1000);
        assertEquals(1000, account.getBalance());

        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    public void Withdraw_Not_Enough_money() {
        Person person = PersonGenerator.generatePerson("아무개");

        Bank bank = new Bank("카카오", 570000000);
        NormalAccount account = (NormalAccount) bank.create(person, AccountFactory.Type.NORMAL);

        account.deposit(1000);
        assertEquals(1000, account.getBalance());
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
    }
}
