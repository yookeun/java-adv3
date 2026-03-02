package lambda.lambda2;

import lambda.MyFunction;

/**
 * 람다를 변수에 저장하고 재할당하는 방법 학습
 * - 람다는 함수형 인터페이스 타입 변수에 저장할 수 있다.
 * - 변수에 다른 람다를 재할당하면 동작이 바뀐다.
 */
public class LambdaPassMain1 {

    public static void main(String[] args) {
        // 람다를 변수에 저장 - 각각 덧셈, 뺄셈 연산을 담는다
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        System.out.println("add = " + add.apply(1, 2)); // 3
        System.out.println("sub = " + sub.apply(1, 2)); // -1

        // cal 변수에 add 람다를 할당 → 덧셈 동작
        MyFunction cal = add;
        System.out.println("cal = " + cal.apply(1, 2)); // 3

        // cal 변수를 sub 람다로 재할당 → 뺄셈 동작으로 교체
        cal = sub;
        System.out.println("cal = " + cal.apply(2, 3)); // -1
    }
}
