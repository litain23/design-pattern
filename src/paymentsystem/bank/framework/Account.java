package paymentsystem.bank.framework;

import paymentsystem.person.Person;

public interface Account {
    public void deposit(long money);
    public long withdraw(long money);
    public long getBalance();
    public Person getOwner();

    // TODO: Account 의 상위 개념으로 abstract 로 만들어 필드를 넣어줄 지 고민 필요
}
