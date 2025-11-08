package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * <pre>
 * IntermediateOperationsMain
 * author : yookeun
 * 2025-10-04
 * desc :
 * </pre>
 */
public class IntermediateOperationsMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        System.out.println("1. filter 짝수만 선택");
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");


        System.out.println("2. map");
        numbers.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("3. distinct");
        numbers.stream().distinct().forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("4. sorted (기본 정렬)");
        Stream.of(3,1,4,1,2,3,4,9,2,5,6)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("5. sorted with Comparator - 내림차순 정렬");
        Stream.of(3,1,4,1,2,3,4,9,2,5,6)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("6. peek - 동작 확인용");
        numbers.stream().peek(n -> System.out.print("before : " + n + ", "))
                .map(n -> n * n)
                .peek(n -> System.out.print("after : " + n + ", "))
                .limit(5)
                .forEach(n -> System.out.println("최종값: " + n));
        System.out.println("\n");
        System.out.println("7. limit - 처음 5개 요소만");
        numbers.stream().limit(5).forEach(n -> System.out.print(n + " "));

        //. Skip
        System.out.println("8. skip - 처음 5개 요소를 건더뛰기");
        numbers.stream().skip(5).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        List<Integer> numbers2 = List.of(1,2,3,4,5,1,2,3);

        System.out.println("9. takeWhile - 5보다 작은 동안만 선택 ");
        numbers2.stream().takeWhile(n -> n < 5)
                .forEach(n  -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("10. dropWhile - 5보다 작은 동안만 건너뛰기 ");
        numbers2.stream().dropWhile(n -> n < 5).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");



    }
}
