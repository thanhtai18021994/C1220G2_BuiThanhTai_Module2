package _06_inheritance.excercise.model_excercise3;

import _06_inheritance.excercise.model_excercise2.Point2D;

public class MovablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr2 = new float[2];
        arr2[0] = xSpeed;
        arr2[1] = ySpeed;
        return arr2;
    }

    public MovablePoint move() {
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setX(newX);
        setY(newY);
        return this;
    }
    public void move2() {
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setX(newX);
        setY(newY);
    }
    @Override
    public String toString() {
        return super.toString() + "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 4, 6, 8);
        System.out.println(movablePoint.getX());
//        movablePoint.move();
//        System.out.println(movablePoint.getX());
        movablePoint.move2();
        System.out.println(movablePoint.getX());
    }

}
