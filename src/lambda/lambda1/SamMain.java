package lambda.lambda1;

/**
 * <pre>
 * SamMain
 * author : Yookeun
 * 2025-05-28
 * desc :
 * </pre>
 */
public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };
        samInterface.run();

//        NotSamInterface notSamInterface = () -> {
//            System.out.println("not sam");
//        };
//        samInterface.run();
    }
}
