package ObserverPattern;

import java.util.Random;

public class ClickEvent extends Event {
    private int clickCnt;

    @Override
    public String getEventType() {
        return "CLICK";
    }

    @Override
    public void execute() {
        clickCnt++;
        notifyObservers();
    }

    @Override
    public int getCnt() {
        return clickCnt;
    }
}
