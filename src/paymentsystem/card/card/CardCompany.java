package paymentsystem.card.card;

import paymentsystem.bank.account.NormalAccount;
import paymentsystem.bank.framework.Account;
import paymentsystem.card.framework.Card;
import paymentsystem.card.framework.CardFactory;
import paymentsystem.person.Person;

import java.util.ArrayList;
import java.util.List;

public class CardCompany extends CardFactory {
    private List<Card> cardList = new ArrayList<>();
    private String name;

    public CardCompany(String name) {
        this.name = name;
    }

    @Override
    protected Card createProduct(Person owner, Account account) {
        return new CheckCard(owner, account);
    }

    @Override
    protected void registerProduct(Card card) {
        cardList.add(card);
    }

    @Override
    protected List<Card> getCardList() {
        return cardList;
    }

}