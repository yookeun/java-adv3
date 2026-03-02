package lambda.lambda1;

import lambda.Procedure;

/**
 * 람다 본문 작성 방식 2가지 비교
 * - 중괄호 블록({ }) 사용 vs 단일 표현식(expression body) 사용
 */
public class LambdaSimple2 {

    public static void main(String[] args) {
        // 방식 1: 중괄호 블록 사용 - 본문에 여러 문장을 넣을 수 있다
        Procedure procedure1 = () -> {
            System.out.println("hello1 lambda");
        };
        procedure1.run();

        // 방식 2: 단일 표현식 - 문장이 하나일 때 중괄호와 세미콜론을 생략할 수 있다
        Procedure procedure2 = () -> System.out.println("hello lambda");
        procedure2.run();
    }

}
