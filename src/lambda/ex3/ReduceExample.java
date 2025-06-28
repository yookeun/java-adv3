package lambda.ex3;

import java.util.List;
import java.util.function.BinaryOperator;
import lambda.ex2.MyReducer;

/**
 * <pre>
 * ReduceExample
 * author : yk
 * 2025-06-07
 * desc :
 * </pre>
 */
public class ReduceExample {

    public static int reduce(List<Integer> list,  int initial, BinaryOperator<Integer> reducer) {
        int result = initial;
        for (Integer val : list) {
            result = reducer.apply(result, val);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        System.out.println("리스트 : " + numbers);

        //1. 합 구하기 (초기갓 0, 덧셈 로직)
        int sum = reduce(numbers, 0, (a,b) -> a + b);
        System.out.println("sum = " + sum);

        //2. 곱 구하기 (초기값 1, 곱셈 로직)
        int mul = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("mul = " + mul);
    }
}
