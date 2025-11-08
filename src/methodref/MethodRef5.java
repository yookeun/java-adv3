package methodref;

import java.util.List;
import lambda.lambda5.stream.MyStreamV3;

/**
 * <pre>
 * MethodRef5
 * author : yookeun
 * 2025-08-30
 * desc :
 * </pre>
 */
public class MethodRef5 {

    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Kim"), new Person("David"),
                new Person("John"));

        List<String> result1 = MyStreamV3.of(personList)
                .map(person -> person.introduce())
                .map(str -> str.toUpperCase())
                .toList();

        System.out.println("result1 = " + result1);

        List<String> result2 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();

        System.out.println("result2 = " + result2);

    }

}
