package lambda.lambda1;

@FunctionalInterface
public interface SamInterface {
    void run();

    //// 실수로 누군가 추가시 컴파일 오류 발생
    //@FunctionalInterface` 을 통해 함수형 인터페이스임을 선언해두면, 이후에 누군가 실수로 추상 메서드를
    //추가할 때 컴파일 오류가 발생한다.
    //void gogo();
}
