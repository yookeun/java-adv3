package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lambda.lambda5.GenericFilter;
import lambda.lambda5.map.GenericMapper;

/**
 * <pre>
 * Ex1_Number
 * author : yookeun
 * 2025-07-24
 * desc :
 * </pre>
 */
public class Ex1_Number {

    public static void main(String[] args) {
// 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);
        List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);

        List<Integer> lambdaResult2 = lambda2(numbers);
        System.out.println("lambdaResult2 = " + lambdaResult2);


    }
    static List<Integer> direct(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                int numberX2 = number * 2;
                result.add(numberX2);
            }
        }
        return result;

    }
    static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filteredList = GenericFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> mapped = GenericMapper.map(filteredList, n -> n * 2);
        return mapped;
    }

    static List<Integer> lambda2(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).toList();
    }
}
