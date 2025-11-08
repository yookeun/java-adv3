package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * <pre>
 * PrimitiveStreamMain
 * author : yookeun
 * 2025-10-09
 * desc :
 * </pre>
 */
public class PrimitiveStreamMain {
    public static void main(String[] args) {
        //기본형 특화 스트림 생성(IntStream, LongStream, DoubleStream)
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        //범위 생성 메서드 (InsStream, LongStream)
        IntStream stream1 = IntStream.range(1, 6);
        IntStream range1 = IntStream.rangeClosed(1, 5);
       // range1.forEach(i -> System.out.print(i + " "));
        System.out.println();

        //1. 통계 관련 메서드(sum, average, max, min, count)
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        // average(): 평균값 계산
        double avg = IntStream.range(1, 6)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        IntSummaryStatistics status = IntStream.range(1, 6).summaryStatistics();
        System.out.println("status = " + status);

        LongStream longStream = IntStream.range(1, 5).asLongStream();
        System.out.println("longStream = " + longStream);
        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();
        System.out.println("doubleStream = " + doubleStream);
        Stream<Integer> boxedStream = IntStream.range(1, 5).boxed();

        //int -> long
        LongStream mappedLong = IntStream.range(1, 5).mapToLong(i -> i * 10L);

        // int -> double
        DoubleStream doubleStream1 = IntStream.range(1, 5).mapToDouble(i -> i * 1.5);

        // int -> 객체 변환
        Stream<String> mmappedObj = IntStream.range(1, 5).mapToObj(i -> "Number " + i);

        //객체 스트림 -> 기본형 특화 스트림으로 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);

        int result = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("result = " + result);


    }
}
