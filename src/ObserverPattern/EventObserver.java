package ObserverPattern;

public class EventObserver implements Observer {
    @Override
    public void update(Event event) {
        if(event.getEventType().equals("CLICK")) {
            System.out.println("CLICK SOMETHING PROCESS , cnt : " + event.getCnt());

        } else if(event.getEventType().equals("TAB")) {
            System.out.println("TAB SOMETHING PROCESS , cnt : " + event.getCnt());
        }

    }
}
