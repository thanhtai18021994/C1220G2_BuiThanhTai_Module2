package _review_oop.oop_java_1.excercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListVehicle {
    private static List<Vehicle> vehicleList=new ArrayList<>();

    public ListVehicle(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    public static void choose(){
        System.out.println("What action would you like to do ? \n 1: create new object\n 2: export list\n 3:exit");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        switch (choose){
            case 1:
                createObject();
                choose();
                break;
            case 2:
                exportList();
                choose();
            case 3:
                exit();
                System.out.println("Exit");
                break;
            default:
                System.out.println("Enter again");
        }
    }
    public static void createObject(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter cylinder of vehicle");
        int cylinder=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter perice vehicle");
        int price=Integer.parseInt(scanner.nextLine());
        vehicleList.add(new Vehicle(cylinder,price));
    }
    public static void exportList(){
        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle.countTax());
        }
    }
    public static void exit(){
        return;
    }

    public static void main(String[] args) {
        choose();
    }
}
