package AdapterPattern;

public class DoSomethingAdapter implements DoSomething {
    private DoSomethingOld doSomethingOld;
    private DoSomethingNew doSomethingNew;
    private int version;

    public DoSomethingAdapter(int version) {
        if(version == 1) {
            doSomethingOld = new DoSomethingOld();
        } else if(version == 2){
            doSomethingNew = new DoSomethingNew();
        }
        this.version = version;
    }

    @Override
    public void doSomething() {
        if(this.version == 1) {
            System.out.println("adapter is change old version to new version");
            doSomethingOld.sayHello();
        } else if(this.version == 2){
            doSomethingNew.sayHello();
        }
    }
}
