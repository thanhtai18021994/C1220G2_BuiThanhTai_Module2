package _04_java_object.exercise;

class FanClass {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int speed = Slow;
    private boolean On = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return this.Slow;
    }

    public int getMedium() {
        return this.Medium;
    }

    public int getFast() {
        return this.Fast;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeed) {

        this.speed = newSpeed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public Boolean getOn() {
        return this.On;
    }

    public void setOn(boolean status) {
        this.On = status;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String display() {
        if (On == true) {
            return "Fan is on, " + " this radius is" + radius + " this color is " + color + " this speed is " + speed;
        } else {
            return "Fan is off" + "this color is " + color + "this radius is " + radius;
        }
    }

}

public class Fan {
    public static void main(String[] args) {
        FanClass myFan1 = new FanClass();
        myFan1.setSpeed(3);
        myFan1.setColor("blue");
        myFan1.setRadius(10);
        System.out.println(myFan1.display());
        FanClass myFan2 = new FanClass();
        myFan2.setSpeed(2);
        myFan2.setColor("yellow");
        myFan2.setRadius(5);
        System.out.println(myFan2.display());

    }
}
