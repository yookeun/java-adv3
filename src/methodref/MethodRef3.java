package methodref;

import java.time.Period;
import java.util.function.Function;

/**
 * <pre>
 * MethodRef3
 * author : yookeun
 * 2025-08-24
 * desc :
 * </pre>
 */
public class MethodRef3 {

    public static void main(String[] args) {
        //4. 임의 걕체의 인스턴스 메서드 참도
        Person person1 = new Person("Kim");
        Person person2 = new Person("Park");
        Person person3 = new Person("Lee");

        Function<Person, String> fun1 = person -> person.introduce();

        System.out.println("person1.instroude = " + fun1.apply(person1));
        System.out.println("person2.instroude = " + fun1.apply(person2));
        System.out.println("person3.instroude = " + fun1.apply(person3));

        Function<Person, String> fun2 = Person::introduce;
        System.out.println("person1.introduce = " + fun2.apply(person1));
    }
}
