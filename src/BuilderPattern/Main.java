package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new SmallSizeBuilder());
        director.construct();

        director.setBuilder(new BigSizeBuilder());
        director.construct();

        // Builder Pattern
        // Template과 다른걸 잘 모르겠다. Template 은 abstract 클래스로 틀을 만들고
        // Builder에서는 Director의 construct 가 틀을 만들어서 가지고 있는다.

        // Template는 abstract class(final을 사용하기위해)가 꼭 필요하지만, Builder는 interface만으로도 가능하다.

        // builder가 한다리를 건너서 지켜보는 느낌이 난다.. 이 점이 무엇을 어떻게 편하게 하는지 모르겠다.
        // 굉장히 비슷한 느낌..
    }
}
