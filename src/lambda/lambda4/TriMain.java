package lambda.lambda4;

/**
 * <pre>
 * TriMain
 * author : yookeun
 * 2025-06-27
 * desc :
 * </pre>
 */
public class TriMain {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a , b , c) -> a + b + c;
        System.out.println(triFunction.apply(1,2,3));
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
