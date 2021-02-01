import java.util.Scanner;

public class ReverstArray {
    public static void main(String[] args) {
        String[] myArr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so ky tu muon them vao mang");
        int number=sc.nextInt();
        myArr=new String[number];
        for(int i=0;i<myArr.length;i++){
            System.out.println("Nhap phan tu thu: "+(i+1));
            myArr[i]=sc.nextLine();
            System.out.println(myArr[i]);
        }
        for(int i=0;i<myArr.length/2;i++){
            String tenp=myArr[i];
            myArr[i]=myArr[myArr.length-1-i];
            myArr[myArr.length-1-i]=tenp;
        }
        for(int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }
    }
}
