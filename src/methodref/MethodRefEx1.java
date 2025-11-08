package methodref;

import java.util.function.Supplier;

/**
 * <pre>
 * MethodRefEx1
 * author : yookeun
 * 2025-08-17
 * desc :
 * </pre>
 */
public class MethodRefEx1 {

    public static void main(String[] args) {
        //1. 정적 메소드 참조
        Supplier<String>  staticMethod = () -> Person.greeting();
        Supplier<String>  staticMethod2 = Person::greeting;

        System.out.println("staticMethod = " + staticMethod.get());
        System.out.println("staticMethod2 = " + staticMethod2.get());

        //2. 특정객체의 인스턴스 참조
        Person person = new Person("kim");
        Supplier<String> instanceMethod = () -> person.introduce();
        Supplier<String> instanceMethod2 = person::introduce;
        System.out.println("instanceMethod = " + instanceMethod.get());
        System.out.println("instanceMethod2 = " + instanceMethod2.get());

        //3. 생성자 참조
        Supplier<Person> newPerson1 = () -> new Person();
        Supplier<Person> newPerson2 = Person::new;
        System.out.println("newPerson1 = " + newPerson1.get());
        System.out.println("newPerson2 = " + newPerson2.get());

    }
}
