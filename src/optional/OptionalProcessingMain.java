package optional;

import java.util.Optional;

public class OptionalProcessingMain {

    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        //값이 존재하면 Consumer 실행
        optValue.ifPresent(value -> System.out.println("optValue = " + value));
        optEmpty.ifPresent(value -> System.out.println("optEmpty = " + value)); //실행 안됨

        //값이 있으면 Consumer 실행 실행, 없으면 실행 안됨
        optValue.ifPresentOrElse(
                value -> System.out.println("optValue = " + value),
                () -> System.out.println("값이 없습니다"));
        optEmpty.ifPresentOrElse(
                value -> System.out.println("optEmpty = " + value),
                () -> System.out.println("값이 없습니다")
        );

        //값이 있으면 Function 적용후 Optional 반환, 없으면 Optional.empty() 반환
        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);
        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);

        Optional<String> optValue2 = Optional.of("Hello");
        Optional<Optional<String>> nestedOpt = optValue.map(s -> Optional.of(s));
        System.out.println("nestedOpt = " + nestedOpt);

        Optional<String> flattenOpt = optValue.flatMap(s -> Optional.of(s));
        System.out.println("flattenOpt = " + flattenOpt);

        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        System.out.println("filtered1 = " + filtered1);
        Optional<String> filtered2 = optValue.filter(s -> s.startsWith("J"));
        System.out.println("filtered2 = " + filtered2);

        optValue.stream().forEach(s -> System.out.println("optEmpty -> "  + s));
    }
}
