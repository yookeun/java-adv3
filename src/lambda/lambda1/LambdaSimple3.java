package lambda.lambda1;

import lambda.MyFunction;

/**
 * <pre>
 * LambdaSimple3
 * author : Yookeun
 * 2025-05-30
 * desc :
 * </pre>
 */
public class LambdaSimple3 {

    public static void main(String[] args) {
        //타입 생략 전
        MyFunction function1 = (int a, int b) -> a + b;
        System.out.println("function1 = " + function1.apply(1, 2));

        //타입 추론
        MyFunction function2 = (a, b) -> a + b;
        System.out.println("function2 = " + function2.apply(1, 2));
    }

}
