package CompositePattern;

import BuilderPattern.Director;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Make Root entries");
            Directory rootdir= new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("vi", 1000));
            bindir.add(new File("latex", 200000));
            rootdir.printList();

            Directory Harry = new Directory("Harry");
            Directory Lone = new Directory("Lone");
            Directory Hermion = new Directory("Hermion");

            usrdir.add(Harry);
            usrdir.add(Lone);
            usrdir.add(Hermion);

            Harry.add(new File("homework", 100));

            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }


        // Composite Pattern

        // 구현 문제로 나온 파일 시스템의 정답 같다
        // 거기는 Directory 만 있고 File은 없어서 한 가지 클래스르 만들어서 했으나
        // 이게 정답인거 같다.. Entry 라는 모두를 포함하는 것이 있어 File 이든 Dir이든 넣을 수 있고
        // File 과 Dir은 구현에 맡긴다... 확장성도 넓다..?
        // Read라는 명령어를 추가하면 Entry에 그냥 read() 함수와 구현은 아래에서 구체적으로 구현하면 되니까..
        // ....! 새삼느끼지만 깔끔하고 좋다



    }
}
