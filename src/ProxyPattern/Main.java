package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrintProxy("Alice");
        p.setPrintName("Bob");
        p.print("hello");

        // Proxy Pattern

        // 간단(?)하게 할 수 있는 일은 Proxy에 위임
        // 하지만 진짜가 필요할 경우 Proxy에서 Concrete Class를 호출하여 사용

        // 여기서는 setName과 getName을 위임
        // 그리고 print가 필요할 때, 진짜 class의 print()를 호출하여 사용
        // 객체 생성하는 데 오래걸릴 때, 무언가를 로드하는데 오래걸릴 때 사용하면 좋을듯싶다
        // 다른 쉬운 작업은 Proxy에 위임!
    }
}
