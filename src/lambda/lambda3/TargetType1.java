package lambda.lambda3;

/**
 * <pre>
 * TargetType1
 * author : yk
 * 2025-06-16
 * desc :
 * </pre>
 */
public class TargetType1 {

    public static void main(String[] args) {
        //람다 직접 대입
        FunctionA functionA =i -> "value = " + i;
        FunctionA functionB =i -> "value = " + i;
        System.out.println("functionA = " + functionA.apply(10));
        System.out.println("functionB = " + functionB.apply(10));

        //이미 만들어진 FunctionA 인스턴스를 FunctionB 에 대입
        //FunctionB targetB = functionA; //컴파일 에러

    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}
