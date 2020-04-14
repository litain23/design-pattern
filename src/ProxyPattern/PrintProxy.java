package ProxyPattern;

public class PrintProxy implements Printable {
    private String name;
    private Printer real;
    public PrintProxy() { }

    public PrintProxy(String name) {
        this.name = name;
    }

    @Override
    public void print(String str) {
        realize();
        real.print(str);
    }

    private synchronized void realize() {
        if(real == null) {
            real = new Printer(name);
        }
    }

    @Override
    public synchronized void setPrintName(String name) {
        if(real != null) {
            real.setPrintName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return null;
    }

}
