package methodref;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <pre>
 * MethodRefEx1
 * author : yookeun
 * 2025-08-17
 * desc :
 * </pre>
 */
public class MethodRefEx2 {

    public static void main(String[] args) {
        //1. 정적 메소드 참조
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;

        System.out.println("staticMethod1 = " + staticMethod1.apply("kim"));
        System.out.println("staticMethod2 = " + staticMethod2.apply("kim"));

        //2. 특정객체의 인스턴스 참조
        Person person = new Person("kim");
        Function<Integer, String> instanceMethod1 = n -> person.introductionWithNumber(n);
        Function<Integer, String> instanceMethod2 = person::introductionWithNumber;
        System.out.println("instanceMethod = " + instanceMethod1.apply(10));
        System.out.println("instanceMethod2 = " + instanceMethod2.apply(10));

        //3. 생성자 참조
        Function<String, Person> newPerson1 = name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;
        System.out.println("newPerson1 = " + newPerson1.apply("lee"));
        System.out.println("newPerson2 = " + newPerson2.apply("lee"));

    }
}
