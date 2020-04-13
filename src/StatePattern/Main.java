package StatePattern;

public class Main {
    public static void main(String[] args) {
        Airpot airpot = new Airpot();
        airpot.playSong();

        airpot.changeListeningMode();
        airpot.playSong();
        airpot.changeListeningMode();
        airpot.playSong();
        airpot.changeListeningMode();
        airpot.playSong();
        airpot.changeListeningMode();
        airpot.playSong();

        // State Pattern
        // strategy 패턴과 유사하지만, 차이점은 나름의 상태변환에 규칙이 있다는 점 같다
        // strategy 패턴은 구현자가 마음대로(?) 수정을 하지만, state는 상태변화에 따라 규칙을 정하고 그 상태에 따른 구현을 한다.
        // 비슷하긴 한데.. 상태변이라는 점이 다른 것 같다
    }
}
