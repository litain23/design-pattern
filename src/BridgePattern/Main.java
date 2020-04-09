package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Bridge Pattern"));
        display.print();
        CountDisplay display1 = new CountDisplay(new StringDisplayImpl("Bridge Pattern"));
        display1.countPrint(10);

        // Bridge Pattern

        // 흠.......
        // 기능과 구현을 분리............
        // 기능 = Display Class 내가 구현에 있는것을 가져다가 ~~ 할것이다.
        // 구현 = DisplayImple Class 내가 행동해야하는 것을 구현한다

        // 기능이 계획, 구현은 계획을 실천하는 것....

        // 원래대로라면 아래와 같이 구현이 될것
        /*
        class Display() {
            private String str;
            public Display(String str) {
                this.str = str;
            }

            public void open() {
                System.out.println("OPEN");
            }
            public void close() {
                System.out.println("CLOSE");
            }
            public void print() {
                System.out.println(str);
            }
        }
         */

        // Template 패턴이 하나의 고정된 기능(Template)이 있고 구현은 구현 클래스에게 위임을 해버린다
        // Bridge Pattern 또한 비슷
        // Bridge Pattern 도 구현은 위임하고 하나의 고정된 기능이 아닌,
        // 기능을 확장할 수 있게 한다. 열린 확장(O) , 변경 닫힘(? 아직 모르겠음..)
        // 확장된 기능 또한 구현을 마음대로 사용할 수 있다!!  오........... interface로 받아서 ..오....

    }
}
