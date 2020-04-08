package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.doSomething();

        // Singleton Pattern

        // 객체가 하나임을 보장하기 위해 만든것.
        // getInstance() 를 할때 객체를 만드는 로직은 다중스레드일 경우, 동시에 접근할때 서로 다른 객체가 리턴될수도 있다
        // 위의 예제는 그런 예외는 없다.

        // db접근 같은 특정한 하나의 경로만을 통해서 가져오는 행위같을 것을 좋을 거 같다

    }
}
