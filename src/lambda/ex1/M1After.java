package lambda.ex1;

/**
 * <pre>
 * M1After
 * author : Yookeun
 * 2025-06-02
 * desc :
 * </pre>
 */
public class M1After {

    public static void greet(String message) {
        System.out.println("=== 시작 ===");
        System.out.println(message);
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
        greet("Good Morning!");
        greet("Good Afternoon!");
        greet("Good Evening!");
    }
}
