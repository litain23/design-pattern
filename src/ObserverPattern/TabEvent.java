package ObserverPattern;

public class TabEvent extends Event{
    private int tabCnt;

    @Override
    public String getEventType() {
        return "TAB";
    }

    @Override
    public void execute() {
        tabCnt++;
        notifyObservers();
    }

    @Override
    public int getCnt() {
        return tabCnt;
    }
}
