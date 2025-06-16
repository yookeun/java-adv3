package lambda.lambda3;




/**
 * <pre>
 * GenricMain1
 * author : yk
 * 2025-06-14
 * desc :
 * </pre>
 */
public class GenricMain5 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        GenericFunction<Integer, Integer> square = n -> n * n;
        Integer result2 =  square.apply(5);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
