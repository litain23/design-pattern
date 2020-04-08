package BuilderPattern;

public class SmallSizeBuilder implements Builder {
    @Override
    public void makeTitle(String title) {
        System.out.println("Title : small font size " + title);
    }

    @Override
    public void makeString(String str) {
        System.out.println("Sub title : small font size " + str);
    }

    @Override
    public void makeItems(String[] items) {
        for(String item : items) {
            System.out.println(item);
        }
    }

    @Override
    public void close() {
        System.out.println("small size");
    }
}
