package lambda.ex2;

/**
 * <pre>
 * BuildGreeterExample
 * author : yk
 * 2025-06-07
 * desc :
 * </pre>
 */
public class BuildGreeterExample {

    //고차 함수, greeting 문자열을 받아 "새로운 함수를 반환"
    public static StringFunction buildGreeter(String greeting) {
        return s -> greeting +", " + s;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("Hello");
        StringFunction hiGreeter = buildGreeter("Hi");

        //함수가 반환되므로 apply()를 호출하여 사용
        System.out.println("hiGreeter = " + helloGreeter.apply("Java"));     //Hello, Java
        System.out.println("hiGreeter = " + helloGreeter.apply("Lambda"));   //Hi, Lambda
    }
}
