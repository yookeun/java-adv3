package lambda.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * <pre>
 * MapExample
 * author : yk
 * 2025-06-06
 * desc :
 * </pre>
 */
public class MapExample {

    public static List<String> map(List<String> list,  StringFunction fucn) {

        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(fucn.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + words);

        //1. 대문자 반환
        List<String> upperList = map(words, s -> s.toLowerCase());
        System.out.println("대문자 변환 결과 = " + upperList);

        //2. 앞뒤로 ***붙이기
        List<String> decorateList = map(words, s -> "***" + s +"***");
        System.out.println("특스문자 변환 결과 = " + decorateList);
    }
}
