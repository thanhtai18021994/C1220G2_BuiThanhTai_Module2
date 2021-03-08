package _00_practice_java.ex2;

import _00_practice_java.Addable;

public class ReferenceMethod {
    public static int addFunc(int a, int b){
        return a+b;
    }
    public static int minusFunc(int a, int b){
        return a*b;
    }
    public static int action(int a, int b, Addable addable){
        return addable.add(a,b);
    }
    public static void main(String[] args) {
        Addable addable=ReferenceMethod::addFunc;
        Addable addable1=ReferenceMethod::minusFunc;
        int d=action(4,5,addable1);
        System.out.println(d);
        int c=action(3,4,addable);
        System.out.println(c);
//        System.out.println(addable);
    }

}
