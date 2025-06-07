package lambda.lambda1;

import lambda.MyFunction;

/**
 * <pre>
 * MyFunction1
 * author : Yookeun
 * 2025-05-26
 * desc :
 * </pre>
 */
public class MyFunction2 {

    public static void main(String[] args) {
        MyFunction myFunction = (int a, int b) -> {
                return a + b;
        };

        int result = myFunction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
