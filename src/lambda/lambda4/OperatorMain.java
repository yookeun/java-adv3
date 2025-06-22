package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * <pre>
 * OperatorMain
 * author : yookeun
 * 2025-06-22
 * desc :
 * </pre>
 */
public class OperatorMain {

    public static void main(String[] args) {

        Function<Integer, Integer> square1 = x -> x * x ;
        UnaryOperator<Integer> square2 = x -> x * x;
        System.out.println("square1 = " + square1.apply(5));
        System.out.println("square2 = " + square2.apply(5));

        BiFunction<Integer,Integer, Integer> addition1 = (a,b) -> a + b;
        BinaryOperator<Integer> addition2 = (a, b) -> a + b;

        System.out.println("addition1 = " + addition1.apply(10, 20));
        System.out.println("addition2 = " + addition2.apply(10, 20));
    }
}
