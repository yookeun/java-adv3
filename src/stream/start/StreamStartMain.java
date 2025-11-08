package stream.start;

import java.util.List;

/**
 * <pre>
 * StreamStartMain
 * author : yookeun
 * 2025-09-06
 * desc :
 * </pre>
 */
public class StreamStartMain {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("result = " + result);

        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(s -> s.toUpperCase()).forEach(System.out::println);

        System.out.println("---------------------------------");
        names.stream().filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
