package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        DoSomething oldVer = new DoSomethingAdapter(1);
        DoSomething newVer = new DoSomethingAdapter(2);

        oldVer.doSomething();
        System.out.println();
        newVer.doSomething();

        // adapter pattern
        // 이미 만들어진 것을 좀더 사용하기 편하게 나만의 인터페이스로 변경하는 것 같은 느낌
        // 일단 위의 예제는 버전이 업데이트되었는데, 아직 예전 버전의 사용자가 요청을 해왔을때
        // 현재 업데이트된 로직을 가져와 사용하기 위해 추가 작업을 어댑터가 해주는 과정

        // 어떤 API 나 라이브러리를 가져와서 사용하는데 편하게 사용
        // 라이브러리의 업데이트 또한 변경 사항에 대해 검증을 할 때,
        // 나의 인터페이스를 테스트툴로 작성해놔서 빠르게 적용가능할 거 같음

        // 그치만 위의 예제는 strategy 패턴이 조금 더 어울릴 거 같다..
    }
}

