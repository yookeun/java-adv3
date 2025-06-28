package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

/**
 * <pre>
 * PrimitiveFunction
 * author : yookeun
 * 2025-06-27
 * desc :
 * </pre>
 */
public class PrimitiveFunction {

    public static void main(String[] args) {
        // 기본형 매개 변수 IntFunction, LongFunction, DoubleFunction
        IntFunction<String> stringIntFunction = x -> "숫지: " + x;
        System.out.println(stringIntFunction.apply(100));

        //기본형 반환
        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println(toIntFunction.applyAsInt("hello"));

        //기본형 매게변수, 기본형 반환
        IntToLongFunction intToLongFunction = x -> x * 100;
        System.out.println(intToLongFunction.applyAsLong(10));

        IntUnaryOperator intUnaryOperator = x -> x * 100;
        System.out.println(intUnaryOperator.applyAsInt(10));
    }

}
