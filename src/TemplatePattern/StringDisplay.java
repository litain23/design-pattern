package TemplatePattern;

public class StringDisplay extends AbstractDisplay{

    @Override
    public void open() {
        System.out.println("Using String Display, Open");
    }

    @Override
    public void print() {
        System.out.println("Print string");
    }

    @Override
    public void close() {
        System.out.println("Using String Display, Close");
    }
}
