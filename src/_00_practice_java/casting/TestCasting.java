package _00_practice_java.casting;

public class TestCasting {
    public static void main(String[] args) {
        Animal a=new Dog("true");
        Animal animal=new Animal("true");
        Dog.amethod(a);
        System.out.println("live");
    }
}
