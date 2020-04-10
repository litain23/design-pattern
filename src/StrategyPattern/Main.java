package StrategyPattern;

public class Main {
    public static void main(String[] args) {

        int seed1 = 10;
        int seed2 = 20;

        Player p1 = new Player("hi", new WinningStrategy(seed1));
        Player p2 = new Player("hi", new ProbStrategy(seed2));

        for(int i=0;i<10000;i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();

            if(nextHand1.isStrongThan(nextHand2)) {
                p1.win();
                p2.lose();
            } else if(nextHand1.isWeakerThan(nextHand2)) {
                p1.lose();
                p2.win();
            } else {
                p1.even();
                p2.even();
            }
        }

        System.out.println(p1.toString());
        System.out.println(p2.toString());


        // Strategy Pattern
        // 음... 비슷하다...
        // Adapter Pattern builder pattern 와 같이 interface로 받아,
        // concrete class 위임해서 동작...
        // 음..! 모르겠다
    }
}
