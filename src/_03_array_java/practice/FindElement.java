import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String[] arr= {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        String input_name;
        boolean isCheck=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ten muon tim trong mang");
        input_name=sc.nextLine();
        for(String name: arr){
            if(name.equals(input_name)){
                System.out.println("ton tai "+input_name+"trong array");
                isCheck=true;
            }
        }
        if(!isCheck){
            System.out.println("Khong co "+input_name+" trong array");
        }
    }
}
