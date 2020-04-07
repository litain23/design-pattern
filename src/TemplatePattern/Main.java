package TemplatePattern;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay stringDisplay = new StringDisplay();
        stringDisplay.display();

        AbstractDisplay charDisplay = new CharDisplay();
        charDisplay.display();


        // template pattern
        // 일정한 틀이 있는 함수가 있을 때 좋다
        // AbstractDisplay에서 final display()로 선언된 것이 틀(template)
        // 그래서 각 concrete 객체(StringDispaly, CharDisplay) 에서 틀의 부품(open, close, print)를 구현하고
        // 틀을 찍어내는 display() 수행

        // 언제좋을까..
        // 공통된 로직이 존재하고, 그걸 구성하는 부품들이 다를때 .. 예시를 모르겠다..
    }
}
