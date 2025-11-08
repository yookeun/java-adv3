package lambda.lambda5.mystream;

import java.util.List;
import lambda.lambda5.stream.MyStreamV3;

/**
 * <pre>
 * MyStreamV1Main
 * author : yookeun
 * 2025-07-26
 * desc :
 * </pre>
 */
public class MyStreamLoopMain {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> result = MyStreamV3.of(students)
                .filter(student -> student.getScore() >= 80)
                .map(student -> student.getName())
                .toList();

        for (String name : result) {
            System.out.println(name);
        }

        //추가
       MyStreamV3.of(students)
                .filter(student -> student.getScore() >= 80)
                .map(student -> student.getName())
                .forEach(name -> System.out.println(name));

    }

}
