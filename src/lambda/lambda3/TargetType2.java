package lambda.lambda3;

import java.util.function.Function;

/**
 * <pre>
 * TargetType2
 * author : yk
 * 2025-06-16
 * desc :
 * </pre>
 */
public class TargetType2 {

    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String hello = upperCase.apply("hello");
        System.out.println("hello = " + hello);

        Function<Integer, Integer> square = n -> n * n;
        Integer apply = square.apply(3);
        System.out.println("apply = " + apply);
    }
}
