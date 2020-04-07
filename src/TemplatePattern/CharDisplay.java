package TemplatePattern;

public class CharDisplay extends AbstractDisplay {
    @Override
    public void open() {
        System.out.println("Using Char Display, Open");
    }

    @Override
    public void print() {
        System.out.println("Print char");
    }

    @Override
    public void close() {
        System.out.println("Using Char Display, Close");
    }
}
