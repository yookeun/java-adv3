package methodref;

/**
 * <pre>
 * Person
 * author : yookeun
 * 2025-08-17
 * desc :
 * </pre>
 */
public class Person {

    private String name;

    public Person() {
        this("Unknown");
    }

    public Person(String name) {
        this.name = name;
    }

    public static String greeting() {
        return "Hello";
    }


    //정적메소드
    public static String greetingWithName(String name) {
        return "Hello " + name;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return "I am " + name;
    }

    public String introductionWithNumber(int number) {
        return "I am " + name + ", my number is " + number;
    }

}
