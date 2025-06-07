package lambda.ex1;

import lambda.MyFunction;

/**
 * <pre>
 * M5Return
 * author : Yookeun
 * 2025-06-02
 * desc :
 * </pre>
 */
public class M5Return {


    public static void main(String[] args) {
        MyFunction add = getOperator("add");
        System.out.println("add.apply(1, 2) = " + add.apply(1, 2));

        MyFunction sub = getOperator("sub");
        System.out.println("sub.apply(1, 2) = " + sub.apply(1, 2));

        MyFunction mul = getOperator("xxx");
        System.out.println("mul.apply(1, 2) = " + mul.apply(1, 2));
    }

    public static MyFunction getOperator(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }

}
