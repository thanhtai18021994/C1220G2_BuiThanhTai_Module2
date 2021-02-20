package _05_access_modifier_static.practice;

public class ThucHanh2 {
    private int id;
    private String name;
    private static String college = "Bach Khoa";

    ThucHanh2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void change() {
        college = "CodeGym";
    }

    public void display(){
        System.out.println(this.id+"  "+this.name+"  "+college);
    }

    public static void main(String[] args) {
        ThucHanh2.change();
        ThucHanh2 student1=new ThucHanh2(111,"Tai");
        ThucHanh2 student2=new ThucHanh2(222,"Trang");
        ThucHanh2 student3=new ThucHanh2(333,"Chinh");
        student1.display();
        student2.display();
        student3.display();
    }
}
