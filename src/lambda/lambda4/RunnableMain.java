package lambda.lambda4;

/**
 * <pre>
 * RunnableMain
 * author : YK
 * 2025-06-21
 * desc :
 * </pre>
 */
public class RunnableMain {

    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> System.out.println("Hello Runnable2");
        runnable2.run();
    }

}
