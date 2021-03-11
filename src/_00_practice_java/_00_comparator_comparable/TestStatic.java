package _00_practice_java._00_comparator_comparable;

public class TestStatic {
    private static int a=1;
    public static void updateProperty(){
        a=a+2;
    }
    public void updateProperty2(){
        a=a+2;
    }
    public void showInfor(){

    }
    public static void main(String[] args) {
        TestStatic testStatic=new TestStatic();
        System.out.println(a);
    testStatic.updateProperty2();
        System.out.println(a);
    }
}
