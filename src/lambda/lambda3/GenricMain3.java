package lambda.lambda3;




/**
 * <pre>
 * GenricMain1
 * author : yk
 * 2025-06-14
 * desc :
 * </pre>
 */
public class GenricMain3 {

    public static void main(String[] args) {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return ((String)s).toUpperCase();
            }
        };
        String result1 = (String) upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return (Integer)s * (Integer)s;
            }
        };
        Integer result2 = (Integer) square.apply(5);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
