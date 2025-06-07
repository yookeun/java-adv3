package lambda.lambda1;

import lambda.Procedure;

/**
 * <pre>
 * ProcedureMain1
 * author : Yookeun
 * 2025-05-26
 * desc :
 * </pre>
 */
public class ProcedureMain1 {

    public static void main(String[] args) {

        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! lambda");
            }
        };

        procedure.run();

    }
}
