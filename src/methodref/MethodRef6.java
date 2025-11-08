package methodref;

import java.util.function.BiFunction;

/**
 * <pre>
 * MethodRef6
 * author : yookeun
 * 2025-08-30
 * desc :
 * </pre>
 */
public class MethodRef6 {

    public static void main(String[] args) {
        Person person = new Person("Kim");

        BiFunction<Person, Integer, String> function = (Person p, Integer number) -> p.introductionWithNumber(number);

        System.out.println("function.apply(person, 1) = " + function.apply(person, 1));

        BiFunction<Person, Integer, String> function2 = Person::introductionWithNumber;
        System.out.println("function2.apply(person, 1) = " + function2.apply(person, 1));
    }
}
