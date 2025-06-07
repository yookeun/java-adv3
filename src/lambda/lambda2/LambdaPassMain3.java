package lambda.lambda2;

import lambda.MyFunction;

/**
 * <pre>
 * LambdaPassMain3
 * author : Yookeun
 * 2025-05-31
 * desc :
 * </pre>
 */
public class LambdaPassMain3 {

    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add.apply(1, 2) = "+ add.apply(1, 2));
        MyFunction sub = getOperation("sub");
        System.out.println("sub.apply(1, 2) = "+ sub.apply(1, 2));
    }

    static MyFunction getOperation(String operator) {
        return switch (operator) {
            case "add" -> (a, b) -> a + b;
            case "sub" -> (a, b) -> a - b;
            default -> (a, b) -> 0;
        };
    }
}
