package _00_practice_java.casting;

public class Dog extends Animal {
private int leg;
    public Dog(String live) {
        super(live);
    }

    public Dog(String live, int leg) {
        super(live);
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    public static  void amethod(Animal a){
            Dog b=(Dog)a;
            System.out.println(":))))))");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Live="+super.getLive()+
                "leg=" + leg +
                '}';
    }
}
