package lambda.lambda3;

/**
 * <pre>
 * GenricMain1
 * author : yk
 * 2025-06-14
 * desc :
 * </pre>
 */
public class GenricMain6 {

    public static void main(String[] args) {
        GenericFunction<String, String> toUpperCase = str -> str.toUpperCase();
        GenericFunction<String, Integer> stringLength = str -> str.length();
        GenericFunction<Integer, Integer> square = x -> x * x;
        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;

        System.out.println(toUpperCase.apply("hello"));
        System.out.println(stringLength.apply("hello"));
        System.out.println(square.apply(2));
        System.out.println(isEven.apply(3));

    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
