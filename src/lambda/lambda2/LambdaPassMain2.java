package lambda.lambda2;

import lambda.MyFunction;

/**
 * 람다를 메서드 인수로 전달하는 방법 학습
 * - 변수에 저장한 람다를 인수로 넘기는 방식
 * - 람다식을 호출 시점에 직접 인수로 넘기는 방식
 */
public class LambdaPassMain2 {

    public static void main(String[] args) {
        // 람다를 변수에 미리 저장한 뒤 메서드 인수로 전달
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;
        System.out.println("변수를 통해 전달");
        calculate(add);
        calculate(sub);

        // 람다식을 메서드 호출 시점에 직접 인수로 전달 (변수 선언 생략)
        System.out.println("람다식을 직접 전달");
        calculate((a, b) -> a + b);
        calculate((a, b) -> a - b);
    }

    /**
     * 전달받은 함수(람다)를 이용해 a, b를 계산하고 결과를 출력한다.
     * @param function 계산에 사용할 MyFunction 람다
     */
    static void calculate(MyFunction function) {
        int a = 1;
        int b = 2;
        System.out.println("계산 시작");
        int result = function.apply(a, b); // 전달된 람다에 따라 동작이 달라진다
        System.out.println("계산 결과 : " + result);
    }

}
