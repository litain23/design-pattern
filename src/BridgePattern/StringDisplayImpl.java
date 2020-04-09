package BridgePattern;

public class StringDisplayImpl implements DisplayImple {
    private String str;
    public StringDisplayImpl(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        System.out.println("OPEN");
    }

    @Override
    public void close() {
        System.out.println("CLOSE");
    }

    @Override
    public void print() {
        System.out.println(str);
    }
}
