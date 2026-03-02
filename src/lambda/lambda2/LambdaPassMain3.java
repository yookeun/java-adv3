package lambda.lambda2;

import lambda.MyFunction;

/**
 * 메서드의 반환값으로 람다를 돌려주는 방법 학습
 * - 조건에 따라 다른 람다를 반환하면 호출부가 동작을 동적으로 선택할 수 있다.
 */
public class LambdaPassMain3 {

    public static void main(String[] args) {
        // 반환된 람다를 변수에 저장하여 사용
        MyFunction add = getOperator("add");
        System.out.println("add.apply(1, 2) = " + add.apply(1, 2)); // 3

        MyFunction sub = getOperator("sub");
        System.out.println("sub.apply(1, 2) = " + sub.apply(1, 2)); // -1

        // 알 수 없는 연산자 → default 람다(항상 0 반환)
        MyFunction xxx = getOperator("xxx");
        System.out.println("xxx.apply(1, 2) = " + xxx.apply(1, 2)); // 0
    }

    /**
     * 연산자 문자열에 해당하는 람다를 반환한다.
     * - "add" : 두 수의 합
     * - "sub" : 두 수의 차
     * - 그 외  : 항상 0을 반환하는 기본 람다
     *
     * @param operator 연산 종류를 나타내는 문자열
     * @return 해당 연산을 수행하는 MyFunction 람다
     */
    static MyFunction getOperator(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0; // 지원하지 않는 연산자는 0으로 처리
        }
    }
}


