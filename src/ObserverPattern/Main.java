package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Event clickEvent = new ClickEvent();
        Event tabEvent = new TabEvent();

        Observer observer = new EventObserver();
        clickEvent.addObserver(observer);
        tabEvent.addObserver(observer);

        clickEvent.execute();
        clickEvent.execute();
        tabEvent.execute();
        tabEvent.execute();
        tabEvent.execute();
        clickEvent.execute();
        clickEvent.execute();

        // Observer Pattern
        // 무언가를 알려줄 때 사용하는 패턴..?
        // Event 자체는 내가 누구한테 알려주는지는 모르고 Observer 라는 인터페이스에 다 넣어 보낸다.
        // Observer 또한 마찬가지!

        // 분리가 되게 잘되있고 간결하며 깔끔
        // 한방에 확 이해되는 패턴..정도...............
    }
}

