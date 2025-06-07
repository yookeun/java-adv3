package lambda.ex1;

/**
 * <pre>
 * M2After
 * author : Yookeun
 * 2025-06-02
 * desc :
 * </pre>
 */
public class M2After {

    public static void print(int weight, String unit) {
        System.out.println("무게: " + weight + unit);
    }

    public static void main(String[] args) {
        print(10, "kg");
        print(50,"lh");
        print(200, "g");
        print(40, "g");
    }
}
