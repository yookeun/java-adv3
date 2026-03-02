package lambda.lambda1;

/**
 * 람다 매개변수 선언 방식 3가지 비교
 * - 타입 명시, 괄호 생략, 타입 생략 등 문법적으로 동등한 표현을 학습한다.
 */
public class LambdaSimple4 {

    public static void main(String[] args) {
        // 방식 1: 매개변수 타입을 명시하고 괄호로 감싼 형태 (가장 명시적)
        MyCall call1 = (int value) -> value * 2;

        // 방식 2: 타입을 생략하되 괄호는 유지한 형태 (타입 추론)
        MyCall call2 = (value) -> value * 2;

        // 방식 3: 매개변수가 하나일 때 괄호까지 생략한 형태 (가장 간결)
        MyCall call3 = value -> value * 2;

        // 세 표현 모두 동일하게 동작한다 (5 * 2 = 10)
        System.out.println("call3 = " + call3.call(5));
    }

    /**
     * 정수를 받아 정수를 반환하는 함수형 인터페이스
     */
    interface MyCall {
        int call(int value);
    }
}
