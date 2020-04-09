package BridgePattern;

public class Display {
    private DisplayImple displayImple;
    public Display(DisplayImple displayImple) {
        this.displayImple = displayImple;
    }

    public void open() {
        displayImple.open();
    }

    public void print() {
        displayImple.print();
    }

    public void close() {
        displayImple.close();
    }
}
