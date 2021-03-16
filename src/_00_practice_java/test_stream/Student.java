package _00_practice_java.test_stream;

public class Student extends Person {
    private int score;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return
                super.getName() +
                "," + super.getAge() +
                "," + score ;
    }
}
