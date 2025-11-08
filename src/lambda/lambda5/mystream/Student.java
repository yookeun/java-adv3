package lambda.lambda5.mystream;

/**
 * <pre>
 * Student
 * author : yookeun
 * 2025-07-26
 * desc :
 * </pre>
 */
public class Student {
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
