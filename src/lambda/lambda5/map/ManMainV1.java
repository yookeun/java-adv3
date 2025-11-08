package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import lambda.lambda5.GenericFilter;

/**
 * <pre>
 * ManMainV1
 * author : yookeun
 * 2025-07-12
 * desc :
 * </pre>
 */
public class ManMainV1 {


    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);

        List<Integer> lengths = mapStringToLength(list);
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> mapStringToInteger(List<String> list) {
        List<Integer> numbers = new  ArrayList<>();
        for (String s : list) {
            numbers.add(Integer.valueOf(s));
        }
        return numbers;
    }

    private static List<Integer> mapStringToLength(List<String> list) {
        List<Integer> numbers = new  ArrayList<>();
        for (String s : list) {
            numbers.add(s.length());
        }
        return numbers;
    }
}
