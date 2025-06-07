package lambda.ex1;

import java.util.Arrays;
import lambda.Procedure;

/**
 * <pre>
 * M3MeasureTime
 * author : Yookeun
 * 2025-06-02
 * desc :
 * </pre>
 */
public class M3MeasureTime {

    public static void measure(Procedure p) {
        long start = System.currentTimeMillis();
        p.run();
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (end - start) + "ms");
    }

    public static void main(String[] args) {
        //1. 익명 클래스로 1부터 N까지의 합 구하기
        measure(new Procedure() {
            @Override
            public void run() {
                int N = 100;
                long sum = 0;
                for (int i = 1; i <= N; i++) {
                    sum += i;
                }
                System.out.println("sum = " + sum);
            }
        });

        measure(new Procedure() {
            @Override
            public void run() {
                int [] arr =  {4,3,2,1};
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " +  Arrays.toString(arr));
            }
        });
    }
}
