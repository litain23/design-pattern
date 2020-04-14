package ProxyPattern;

public class Printer implements Printable{
    private String name;

    public Printer() {
        heavyJob("인스턴스 생성");
    }


    public Printer(String name) {
        this.name = name;
        heavyJob(name + " 인스턴스 생성");
    }

    @Override
    public void print(String str) {
        System.out.println("==PRINT==");
        System.out.println(str);

    }

    @Override
    public void setPrintName(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("완료");
    }
}
