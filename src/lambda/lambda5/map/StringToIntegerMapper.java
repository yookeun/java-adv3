package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * <pre>
 * StringToIntegerMapper
 * author : yookeun
 * 2025-07-19
 * desc :
 * </pre>
 */
public class StringToIntegerMapper {

    public static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(mapper.apply(s));
        }
        return numbers;
    }

}
