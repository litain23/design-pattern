package StatePattern;

public class Airpot {
    private State state;
    private static State[] states = {
            new Normal(),
            new NoiseCanceling(),
            new NoiseAcceptance()
    };
    private int stateNumber;

    public Airpot() {
        stateNumber = 0;
        state = states[0];
    }

    public void playSong() {
        state.playSong();
    }

    public void changeListeningMode() {
        stateNumber = (stateNumber + 1) % 3;
        this.state = states[stateNumber];
    }
}
