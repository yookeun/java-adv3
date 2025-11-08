package lambda.lambda6;

/**
 * <pre>
 * OuterMain
 * author : yookeun
 * 2025-08-05
 * desc :
 * </pre>
 */
public class OuterMain {

    private String message = "외부 클래스";

    public static void main(String[] args) {
        OuterMain outerMain = new OuterMain();
        System.out.println("[외부 클래스] = " + outerMain);
        outerMain.execute();
    }


    public void execute() {

        //익명 클래스
        Runnable runnable = new Runnable() {
            private String message = "익명 클래스";
            @Override
            public void run() {

                System.out.println("[익명 클래스] this : " + this);
                System.out.println("[익명 클래스] this : " + this.getClass());
                System.out.println("[익명 클래스] this : " + this.message);
            }
        };

        Runnable lambdaRunnable = () -> {
            System.out.println("[람다] this : " + this);
            System.out.println("[람다] this : " + this.getClass());
            System.out.println("[람다] this : " + this.message);
        };


        runnable.run();
        System.out.println("=========================");
        lambdaRunnable.run();
    }

}
