package stream.operation;

import java.util.Objects;
import java.util.Optional;
import javax.swing.text.html.Option;

/**
 * <pre>
 * OptionalSimpleMain
 * author : yookeun
 * 2025-10-06
 * desc :
 * </pre>
 */
public class OptionalSimpleMain {

    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.of(10);
        System.out.println("optional1 = " + optional1);
        if (optional1.isPresent()) {
            Integer value = optional1.get();
            System.out.println("value = " + value);
        }

        Optional<Integer> optional2 = Optional.ofNullable(null);
        System.out.println("optional2 = " + optional2);

        if (optional2.isPresent()) {
            Object o = optional2.get();
            System.out.println("value = " + o);
        }

        Object o2 = optional2.get();
        System.out.println("o2 = " + o2);
    }

}
