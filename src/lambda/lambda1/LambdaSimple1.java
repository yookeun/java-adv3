package lambda.lambda1;

import lambda.MyFunction;

/**
 * 람다 표현식의 기본 문법 변형 3가지
 *
 * MyFunction: int apply(int x, int y) 를 가진 함수형 인터페이스
 *
 * 람다 기본 구조: (매개변수) -> { 실행문; return 값; }
 *   - 매개변수 타입은 컴파일러가 인터페이스로부터 추론 가능하므로 생략 가능
 *   - 본문이 return 문 1줄이면 중괄호와 return 키워드 모두 생략 가능 (표현식 람다)
 *   - 본문이 여러 줄이면 중괄호 블록과 return 키워드를 반드시 써야 한다
 */
public class LambdaSimple1 {

    public static void main(String[] args) {

        // ── 기본형: 타입 명시 + 블록 본문 ────────────────────────────────────
        // 매개변수 타입(int)을 명시하고, 중괄호 블록 안에 return 문을 작성한 가장 완전한 형태
        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function1 : " + function1.apply(1, 2));

        // ── 축약형: 표현식 람다 (Expression Lambda) ───────────────────────────
        // 본문이 return 값 하나뿐일 때 중괄호와 return 키워드를 모두 생략할 수 있다.
        // (int a, int b) -> a + b  ≡  (int a, int b) -> { return a + b; }
        MyFunction function2 = (int a, int b) -> a + b;
        System.out.println("function2 : " + function2.apply(1, 2));

        // ── 다중 문장: 블록 본문 (Block Lambda) ──────────────────────────────
        // 본문에 실행 문장이 2개 이상이면 반드시 중괄호 블록을 사용해야 한다.
        // return 키워드도 생략할 수 없다.
        MyFunction function3 = (int a, int b) -> {
            System.out.println("람다 실행");
            return a + b;
        };
        System.out.println("function3 : " + function3.apply(1, 2));
    }

}
