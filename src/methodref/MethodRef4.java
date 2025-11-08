package methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * <pre>
 * MethodRef4
 * author : yookeun
 * 2025-08-30
 * desc :
 * </pre>
 */
public class MethodRef4 {

    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Kim"), new Person("David"),
                new Person("John"));

        List<String> result1 = mapPersonToString(personList, (Person p) -> p.introduce());
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + mapPersonToString(personList, Person::introduce));

        List<String> uppperResult1 = mapStringToString(result1, (String s) -> s.toUpperCase());
        System.out.println("uppperResult1 = " + uppperResult1);

        List<String> uppperResult2 = mapStringToString(result1, String::toUpperCase);
        System.out.println("uppperResult2 = " + uppperResult2);

    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun) {
        List<String> list = new ArrayList<>();
        for (Person person : personList) {
            list.add(fun.apply(person));
        }
        return list;
    }

    static List<String> mapStringToString(List<String> strings, Function<String, String> fun) {
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(fun.apply(string));
        }
        return list;
    }

}