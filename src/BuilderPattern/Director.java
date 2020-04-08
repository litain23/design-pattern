package BuilderPattern;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("속보 : 하위");
        builder.makeTitle("무언가가 일어남");
        builder.makeItems(new String[] {
                "사건1",
                "연쇄사건2"
        });

        builder.close();
    }
}
