package lambda.lambda3;




/**
 * <pre>
 * GenricMain1
 * author : yk
 * 2025-06-14
 * desc :
 * </pre>
 */
public class GenricMain2 {

    public static void main(String[] args) {
        ObjectFunction upperCase = s -> ((String)s).toUpperCase();
        String result1 = (String) upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        ObjectFunction square = n -> (Integer)n * (Integer)n;
        Integer result2 = (Integer) square.apply(5);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
