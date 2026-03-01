package lambda.lambda1;

/**
 * SAM(Single Abstract Method) 인터페이스와 람다 표현식의 관계 설명
 *
 * 람다는 추상 메서드가 정확히 1개인 인터페이스(= 함수형 인터페이스 / SAM 인터페이스)에만 대입할 수 있다.
 *
 * - SamInterface    : 추상 메서드 1개 (run) → 람다 대입 가능
 * - NotSamInterface : 추상 메서드 2개 (run, go) → 람다 대입 불가 (컴파일 오류)
 *
 * 람다는 "어떤 메서드를 구현하는지" 를 메서드 이름 없이 표현하므로,
 * 대상 인터페이스에 추상 메서드가 2개 이상이면 어느 메서드에 해당하는지 컴파일러가 특정할 수 없다.
 */
public class SamMain {

    public static void main(String[] args) {

        // ── SAM 인터페이스 (람다 대입 가능) ──────────────────────────────────
        // SamInterface는 추상 메서드가 run() 하나뿐이므로
        // 컴파일러가 이 람다가 run()의 구현임을 자동으로 인식한다.
        SamInterface samInterface = () -> {
            System.out.println("run");
        };
        samInterface.run();

        // ── Non-SAM 인터페이스 (람다 대입 불가) ──────────────────────────────
        // NotSamInterface는 추상 메서드가 run()과 go() 두 개이므로
        // 람다식이 어느 메서드의 구현인지 알 수 없어 컴파일 오류가 발생한다.
        // → 람다를 쓰려면 반드시 함수형 인터페이스(@FunctionalInterface, 추상 메서드 1개)여야 한다.
        /*
        NotSamInterface notSamInterface = () -> {
            System.out.println("not sam");
        };
         */
    }
}
