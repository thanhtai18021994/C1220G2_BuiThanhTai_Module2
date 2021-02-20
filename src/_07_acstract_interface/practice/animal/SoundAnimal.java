package _07_acstract_interface.practice.animal;

public class SoundAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tigers();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Animal){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
