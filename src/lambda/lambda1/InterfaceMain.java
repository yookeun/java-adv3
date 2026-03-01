package lambda.lambda1;

import lambda.Procedure;

/**
 * 익명 클래스(Anonymous Class)와 람다(Lambda)의 내부 구현 방식 비교
 *
 * - Procedure는 @FunctionalInterface가 붙은 함수형 인터페이스 (추상 메서드 1개)
 * - 함수형 인터페이스는 익명 클래스 또는 람다 표현식으로 구현할 수 있다.
 */
public class InterfaceMain {

    public static void main(String[] args) {

        // ── 익명 클래스(Anonymous Class) ──────────────────────────────────────
        // new 키워드로 인터페이스를 즉석에서 구현하는 방식
        // 컴파일 시 별도의 .class 파일이 생성된다. (예: InterfaceMain$1.class)
        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello1 lambda");
            }
        };

        // 익명 클래스의 클래스명: `외부클래스$숫자` 형태
        //   예) class lambda.lambda1.InterfaceMain$1
        // 인스턴스 출력: 별도 클래스 파일로 만들어진 객체의 기본 toString() 값
        System.out.println("class.class = " + procedure1.getClass());
        System.out.println("class.instance = " + procedure1);

        // ── 람다(Lambda) ──────────────────────────────────────────────────────
        // new 키워드 없이 함수형 인터페이스를 구현하는 방식
        // 내부적으로 invokedynamic(JVM 바이트코드 명령어)을 사용하여
        // 런타임에 동적으로 인스턴스를 생성한다.
        // → 익명 클래스처럼 별도 .class 파일이 생성되지 않아 메모리 효율이 좋다.
        Procedure procedure2 = () -> {
            System.out.println("hello! lambda");
        };

        // 람다의 클래스명: `외부클래스$$Lambda$숫자/...` 형태
        //   예) class lambda.lambda1.InterfaceMain$$Lambda$1/0x...
        // new 키워드를 사용하지 않지만, 람다도 실행 시 인터페이스 타입의 인스턴스가 생성된다.
        // 즉, Procedure 타입 변수에 람다를 대입하면 해당 인터페이스를 구현한 객체가 만들어진다.
        System.out.println("class.class = " + procedure2.getClass());
        System.out.println("class.instance = " + procedure2);
    }
}
