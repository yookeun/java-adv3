package optional;

import java.util.Optional;

public class OptionalCreationMain {

    public static void main(String[] args) {
        // 1. of() : 값이 null 이면 NPE 발생
        String nonNullValue = "Hello Optional";
        Optional<String> opt1 = Optional.of(nonNullValue);
        System.out.println("opt1 = " + opt1);

        // 2. ofNullable() : 값이 null 이면 빈 Optional 객체 생성
        Optional<String> opt2 = Optional.ofNullable("Hello");
        System.out.println("opt2 = " + opt2);
        Optional<String> opt3 = Optional.ofNullable(null);
        System.out.println("opt3 = " + opt3);

        // 3. empty() : 빈 Optional 객체 생성
        Optional<String> opt4 = Optional.empty();
        System.out.println("opt4 = " + opt4);
    }

}
