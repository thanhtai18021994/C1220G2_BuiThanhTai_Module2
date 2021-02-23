package _06_inheritance.excercise.model_excercise4;

public class Shape2 {
    private String color="red";

    public Shape2(String color) {
        this.color = color;
    }
    public Shape2(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
