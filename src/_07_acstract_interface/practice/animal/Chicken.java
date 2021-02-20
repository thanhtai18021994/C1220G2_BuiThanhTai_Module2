package _07_acstract_interface.practice.animal;

import _07_acstract_interface.practice.editble.Editble;

public class Chicken extends Animal implements Editble {
    @Override
    public String makeSound(){
        return "sound:chick chick";
    }
    @Override
    public String howEat(){
        return "could be eat";
    }

    public static void main(String[] args) {
        Chicken chicken=new Chicken();
        System.out.println(chicken.howEat());
    }
};
