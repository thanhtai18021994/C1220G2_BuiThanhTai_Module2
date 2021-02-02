import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;
        int flag1;
        int flag2;
        int flag3;
        String Myflag1;
        String Myflag2;
        String Myflag3;
        Scanner myNum = new Scanner(System.in);
        System.out.println("enter number:");
        number = myNum.nextInt();
        //a=321;
        /* a
        * */
        flag1 = number % 10;
        number = number - flag1;
        flag2 = (number % 100) / 10;
        number = number - flag2 * 10;
        flag3 = (number % 1000) / 100;
        number=flag3*100+flag2*10+flag1;
        if (number >= 100 && number <= 999) {
            switch (flag1) {
                case 1:
                    Myflag1 = "One";
                    break;
                case 2:
                    Myflag1 = "Two";
                    break;
                case 3:
                    Myflag1 = "Three";
                    break;
                case 4:
                    Myflag1 = "Four";
                    break;
                case 5:
                    Myflag1 = "Five";
                    break;
                case 6:
                    Myflag1 = "Six";
                    break;
                case 7:
                    Myflag1 = "Seven";
                    break;
                case 8:
                    Myflag1 = "Eight";
                    break;
                case 9:
                    Myflag1 = "Nine";
                    break;
                default:
                    Myflag1 = "";
            }
            switch (flag2) {
                case 1:
                    Myflag2 = "One";
                    break;
                case 2:
                    Myflag2 = "Two";
                    break;
                case 3:
                    Myflag2 = "Three";
                    break;
                case 4:
                    Myflag2 = "Four";
                    break;
                case 5:
                    Myflag2 = "Five";
                    break;
                case 6:
                    Myflag2 = "Six";
                    break;
                case 7:
                    Myflag2 = "Seven";
                    break;
                case 8:
                    Myflag2 = "Eight";
                    break;
                case 9:
                    Myflag2 = "Nine";
                    break;
                default:
                    Myflag2 = "";
            }
            switch (flag3) {
                case 1:
                    Myflag3 = "One";
                    break;
                case 2:
                    Myflag3 = "Two";
                    break;
                case 3:
                    Myflag3 = "Three";
                    break;
                case 4:
                    Myflag3 = "Four";
                    break;
                case 5:
                    Myflag3 = "Five";
                    break;
                case 6:
                    Myflag3 = "Six";
                    break;
                case 7:
                    Myflag3 = "Seven";
                    break;
                case 8:
                    Myflag3 = "Eight";
                    break;
                case 9:
                    Myflag3 = "Nine";
                    break;
                default:
                    Myflag3 = "";
            }
            if (flag2 == 0) {
                System.out.println(Myflag3 + "hudress " + Myflag1);
            } else if (flag1 == 0) {
                System.out.println(Myflag3 + "hunders" + Myflag2 + "ty");
            } else {
                System.out.println(Myflag3 + "hundress" + Myflag2 + "ty" + Myflag1);
            }

        } else if (number <= 99 && number > 20) {
            switch (flag1) {
                case 1:
                    Myflag1 = "One";
                    break;
                case 2:
                    Myflag1 = "Two";
                    break;
                case 3:
                    Myflag1 = "Three";
                    break;
                case 4:
                    Myflag1 = "Four";
                    break;
                case 5:
                    Myflag1 = "Five";
                    break;
                case 6:
                    Myflag1 = "Six";
                    break;
                case 7:
                    Myflag1 = "Seven";
                    break;
                case 8:
                    Myflag1 = "Eight";
                    break;
                case 9:
                    Myflag1 = "Nine";
                    break;
                default:
                    Myflag1 = "";
            }
            switch (flag2) {
                case 2:
                    Myflag2 = "Twen";
                    break;
                case 3:
                    Myflag2 = "Thir";
                    break;
                case 4:
                    Myflag2 = "For";
                    break;
                case 5:
                    Myflag2 = "Fif";
                    break;
                case 6:
                    Myflag2 = "Six";
                    break;
                case 7:
                    Myflag2 = "Seven";
                    break;
                case 8:
                    Myflag2 = "Eight";
                    break;
                case 9:
                    Myflag2 = "Nine";
                    break;
                default:
                    Myflag2 = "";
            }
            if (flag1 == 0) {
                System.out.println(Myflag2 + "ty");
            } else {
                System.out.println(Myflag2 + "ty" + Myflag1);
            }
        } else if (number >= 10 && number <= 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineTeen");
                    break;
                case 20:
                    System.out.println("twele");
            }
        } else if (number >= 0 && number < 10) {
            switch (flag1) {
                case 0:
                    Myflag1 = "zero";
                case 1:
                    Myflag1 = "One";
                    break;
                case 2:
                    Myflag1 = "Two";
                    break;
                case 3:
                    Myflag1 = "Three";
                    break;
                case 4:
                    Myflag1 = "Four";
                    break;
                case 5:
                    Myflag1 = "Five";
                    break;
                case 6:
                    Myflag1 = "Six";
                    break;
                case 7:
                    Myflag1 = "Seven";
                    break;
                case 8:
                    Myflag1 = "Eight";
                    break;
                case 9:
                    Myflag1 = "Nine";
                    break;
                default:
                    Myflag1 = "";
            }
            System.out.println(Myflag1);
        }
    }
}
