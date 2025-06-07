package lambda.ex2;

/**
 * <pre>
 * ComposeExample
 * author : yk
 * 2025-06-07
 * desc :
 * </pre>
 */
public class ComposeExample {

    // 고차 함수, f1, f2라는 두 함수를 인자로 받아, "f1을 먼저, f2를 나중"에 적용하는 새 함수 반환
    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {

        // 코드 작성
        return s -> {
            String transform = f1.transform(s);
            return f2.transform(transform);
        };

    }

    public static void main(String[] args) {
        // f1: 대문자로 변환
        MyTransformer toUpper = s -> s.toUpperCase();

        // f2: 앞 뒤에 "**" 붙이기
        MyTransformer addDeco = s -> "**" + s + "**";

        // 합성: f1 → f2 순서로 적용하는 함수
        MyTransformer composeFunc = compose(toUpper, addDeco);

        // 실행
        String result = composeFunc.transform("hello");
        System.out.println(result); // "**HELLO**"
    }
}
