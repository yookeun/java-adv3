package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * FilterExample
 * author : Yookeun
 * 2025-06-06
 * desc :
 * </pre>
 */
public class FilterExample1 {

    public static List<Integer> filter(List<Integer> list,  MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        //1 움수만 뽑아내기
        List<Integer> negatives = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });
        System.out.println("음수만  = " + negatives);

        //2. 짝수 구하기
        List<Integer> evens = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 ==0;
            }
        });
        System.out.println("짝수만   = " + evens);


    }
}
