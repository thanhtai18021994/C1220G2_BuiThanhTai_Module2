package _07_acstract_interface.practice.animal;

import _07_acstract_interface.practice.editble.Editble;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tigers();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            if(animal instanceof Chicken){
                Editble editble= (Chicken) animal;
                System.out.println(editble.howEat());
                System.out.println("Dowcasting successfull");
            }else {
                System.out.println("no");
            }
        }
    }
}
