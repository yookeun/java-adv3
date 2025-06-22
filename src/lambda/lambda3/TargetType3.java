package lambda.lambda3;

import java.util.function.Function;

/**
 * <pre>
 * TargetType3
 * author : yk
 * 2025-06-16
 * desc :
 * </pre>
 */
public class TargetType3 {

    public static void main(String[] args) {
        //람다 직접 대임
        Function<Integer, String> functionA = i -> "value = " + i;
        String result = functionA.apply(10);
        System.out.println("result = " + result);

        Function<Integer, String> functionB = functionA;
        String result2 = functionB.apply(20);
        System.out.println("result2 = " + result2);
    }

}
