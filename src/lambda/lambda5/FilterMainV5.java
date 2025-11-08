package lambda.lambda5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * <pre>
 * FilterMainV1
 * author : yookeun
 * 2025-07-03
 * desc :
 * </pre>
 */
public class FilterMainV5 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        //짝수만 거리기
        List<Integer> evenNumbers = GenericFilter.filter(numbers, n -> n % 2 ==0);
        System.out.println("evenNumbers = " + evenNumbers);

        //문자사용
        List<String> names = List.of("A", "BB", "CCC", "박길동");
        List<String> results = GenericFilter.filter(names, s -> s.length() >= 2);
        System.out.println("results = " + results);
    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if(predicate.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }

}
