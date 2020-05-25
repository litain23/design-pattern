package paymentsystem;

import paymentsystem.bank.account.NormalAccount;
import paymentsystem.bank.account.Bank;
import paymentsystem.bank.framework.AccountFactory;
import paymentsystem.person.Person;
import paymentsystem.person.PersonGenerator;

public class Main {
    public static void main(String[] args) {
        Person person = PersonGenerator.generatePerson("아무개");
    }
}
