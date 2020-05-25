package paymentsystem.store;

import paymentsystem.bank.framework.Account;
import paymentsystem.person.Person;

public class Store {
    private Person owner;
    private Account account;
    private long revenue;

    public Store(Person owner, Account account) {
        checkOwnerAndAccount(owner, account);

        this.owner = owner;
        this.account = account;
        this.revenue = 0;
    }

    private void checkOwnerAndAccount(Person owner, Account account) {
        owner.getAccountList().stream()
                .filter(ownerAccount -> ownerAccount.equals(account))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public void saleProduct(long money) {
        account.deposit(money);
        revenue += money;
    }

    public Account getAccount() {
        return account;
    }

    public long getRevenue() {
        return revenue;
    }
}
