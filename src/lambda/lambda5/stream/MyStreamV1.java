package lambda.lambda5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <pre>
 * MyStreamV1
 * author : yookeun
 * 2025-07-26
 * desc :
 * </pre>
 */
public class MyStreamV1 {

    private List<Integer> internalList;

    public MyStreamV1(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public MyStreamV1 filter(Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer element : internalList) {
            if(predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return new MyStreamV1(filteredList);
    }

    public MyStreamV1 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : internalList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV1(mapped);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
