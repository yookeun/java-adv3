package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        //타입 생략 전
        MyFunction function1 = (int x, int y) -> x + y;

        //타입 추론 사용
        MyFunction function2 = (x, y) -> x + y;
        int result = function2.apply(1, 2);
        System.out.println("result = " + result);

    }

}
