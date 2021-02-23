package _06_inheritance.practice.practice2;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, boolean filled, String color) {
        super(radius, filled, color);
    }
    @Override
    public int compareTo(ComparableCircle o){
        if(getRadius()>o.getRadius()){
            return 1;
        }else if(getRadius()<o.getRadius()){
            return -1;
        }else return 0;
    }
}
