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
public class GenericMapper {

    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        List<R> numbers = new ArrayList<>();
        for (T s : list) {
            numbers.add(mapper.apply(s));
        }
        return numbers;
    }

}
