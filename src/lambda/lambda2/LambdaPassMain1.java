package lambda.lambda2;

import lambda.MyFunction;

/**
 * <pre>
 * LambdaPassMain1
 * author : Yookeun
 * 2025-05-31
 * desc :
 * </pre>
 */
public class LambdaPassMain1 {

    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        System.out.println("add.apply(1, 2) = " + add.apply(1, 2));
        System.out.println("sub.apply(1, 2) = " + sub.apply(1, 2));

        MyFunction cal = add;
        System.out.println("cal.apply(1, 2) = " + cal.apply(1, 2));

        cal = sub;
        System.out.println("cal.apply(1, 2) = " + cal.apply(1, 2));
    }

}
