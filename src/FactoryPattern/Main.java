package FactoryPattern;

import FactoryPattern.creditcard.CreditCardFactory;
import FactoryPattern.framework.Factory;
import FactoryPattern.framework.Product;

public class Main {
    public static void main(String[] args) {
        Factory creditCardFactory = new CreditCardFactory();
        Product card1 = creditCardFactory.create("Harry Potter");
        Product card2 = creditCardFactory.create("Hermione Jean Granger");
        Product card3 = creditCardFactory.create("Ron Weasley");

        card1.use();
        card2.use();
        card3.use();

        // Factory Pattern
        // Template의 파생..(?) 같음
        // Factory에 create()는 Template 패턴의 틀 역할
        // create() 할 시 concreteClass인 CreditCardFactory에서 정의된 register 와 createProduct가 동작
        // 신기방기

        // 캡슐화를 위해 Factory의 메소드(create 제외)는 protected로 상속받은 아이들만 사용가능
        // 따봉! 접근제어자를 위한 좋은 예제인거 같다

        // 그리고 상위클래스로 변수받아 LSP 원칙을 지킴.. 크...

    }
}
