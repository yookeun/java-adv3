package lambda.lambda3;

/**
 * <pre>
 * GenricMain1
 * author : yk
 * 2025-06-14
 * desc :
 * </pre>
 */
public class GenricMain1 {

    public static void main(String[] args) {
        StringFunction upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        NumberFunction square = n -> n * n;
        Integer result2 = square.apply(5);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        Integer apply(Integer s);
    }
}
