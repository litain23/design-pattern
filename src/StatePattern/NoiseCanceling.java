package StatePattern;

public class NoiseCanceling implements State {
    @Override
    public void playSong() {
        System.out.println("Play song noise canceling");
    }
}
