package lambda.lambda5.mystream;

import java.util.List;
import lambda.lambda5.stream.MyStreamV1;
import lambda.lambda5.stream.MyStreamV2;

/**
 * <pre>
 * MyStreamV1Main
 * author : yookeun
 * 2025-07-26
 * desc :
 * </pre>
 */
public class MyStreamV2Main {

    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = MyStreamV2.of(numbers).filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println("result = " + result);
    }



}
