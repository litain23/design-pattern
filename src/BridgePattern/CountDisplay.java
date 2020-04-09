package BridgePattern;

public class CountDisplay extends Display{
    public CountDisplay(DisplayImple displayImple) {
        super(displayImple);
    }

    public void countPrint(int cnt) {
        open();
        for(int i=0;i<cnt;i++) {
            print();
        }
        close();
    }
}
