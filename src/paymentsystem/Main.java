package paymentsystem;

import paymentsystem.bank.account.Account;
import paymentsystem.bank.account.Bank;
import paymentsystem.bank.framework.Factory;
import paymentsystem.bank.framework.Product;
import paymentsystem.person.Person;
import paymentsystem.person.PersonGenerator;

public class Main {
    public static void main(String[] args) {
        Person person = PersonGenerator.generatePerson("아무개");

        Factory bank1 = new Bank("신한", 1100000000);
        Factory bank2 = new Bank("카카오", 570000000);

        Account account = (Account) bank1.create(person);
        System.out.println(account.getOwner());
        System.out.println(account.getBalance());
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.deposit(1000);

    }
}
