package _review_oop.oop_java_2.excercise1;

import java.util.*;

public class OfficerManage {
    private static List<Officers> officersList = new LinkedList<>();

    public OfficerManage(List<Officers> officersList) {
        this.officersList = officersList;
    }

    public static void exitProgram() {
        return;
    }

    public static void addOffcer() {
        System.out.println("What officer would you like add ? \n 1:Enginerr \n 2:Staff \n 3:Worker \n 4:exit");
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("enter name");
                String name = scanner.nextLine();
                System.out.println("enter birth DD/MM/YY");
                String birth = scanner.nextLine();
                System.out.println("enter gender");
                String gender = scanner.nextLine();
                System.out.println("enter adress");
                String address = scanner.nextLine();
                System.out.println("Enter major");
                String major = scanner.nextLine();
                officersList.add(new Engineer(name, birth, gender, address, major));
                addOffcer();
                break;
            case 2:
                System.out.println("enter name");
                String nameStaff = scanner.nextLine();
                System.out.println("enter birth DD/MM/YY");
                String birthStaff = scanner.nextLine();
                System.out.println("enter gender");
                String genderStaff = scanner.nextLine();
                System.out.println("enter adress");
                String addressStaff = scanner.nextLine();
                System.out.println("Enter major");
                String workStaff = scanner.nextLine();
                officersList.add(new Staff(nameStaff, birthStaff, genderStaff, addressStaff, workStaff));
                addOffcer();
                break;
            case 3:
                System.out.println("enter name");
                String nameWorker = scanner.nextLine();
                System.out.println("enter birth DD/MM/YY");
                String birthWorker = scanner.nextLine();
                System.out.println("enter gender");
                String genderWorker = scanner.nextLine();
                System.out.println("enter adress");
                String addressWorker = scanner.nextLine();
                System.out.println("Enter major");
                byte leve = scanner.nextByte();
                officersList.add(new Worker(nameWorker, birthWorker, genderWorker, addressWorker, leve));
                addOffcer();
                break;
            default:
                System.out.println("enter again");

        }
    }

    public static void Search() {
        System.out.println("Enter name that you'd like search:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (int i=0;i<officersList.size();i++){
            if(name.equals(officersList.get(i).getName())){
                System.out.println(officersList.get(i));
            }
        }
    }
    public static void sortName(){
        Collections.sort(officersList);
    }
    public static void exit(){
        return;
    }
    public static void controlTable(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What choose would you like ? \n 1:add information \n 2: Search name \n 3: Sort \n 4: show information \n 5:exit");
        int choose=scanner.nextInt();
        switch (choose){
            case 1:
                addOffcer();
                controlTable();
                break;
            case 2:
                Search();
                controlTable();
                break;
            case 3:
                sortName();
                controlTable();
                break;
            case 4:
                for (int i=0;i<officersList.size();i++){
                    System.out.println(officersList.get(i).toString());
                }
                controlTable();
                break;
            case 5:
                exit();
                controlTable();
                break;
            default:
                System.out.println("enter again");
        }

    }

    public static void main(String[] args) {

    }

}
