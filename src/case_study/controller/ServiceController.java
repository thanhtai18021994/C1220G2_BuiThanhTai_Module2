package case_study.controller;

import case_study.common.ServiceException;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ServiceController {
    VillaManage villaManage = new VillaManage();
    HouseManage houseManage = new HouseManage();
    RoomManage roomManage = new RoomManage();
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("Enter your choice\n" +
                "1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        byte choose = scanner.nextByte();
        switch (choose) {
            case 1:
                addNewService();
                displayMainMenu();
                break;
            case 2:
                displayMainMenu();
                break;
            case 3:
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                displayMainMenu();
                break;
            case 6:
                displayMainMenu();
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("Enter again!!");
                displayMainMenu();
        }

    }

    public void addNewService() {
        System.out.println("Enter service:\n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room \n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        byte choose = 0;
        try {
            choose = scanner.nextByte();
            switch (choose) {
                case 1:
                    villaManage.createVilla();
                    addNewService();
                    break;
                case 2:
                    houseManage.createHouse();
                    addNewService();
                    break;
                case 3:
                    roomManage.createRoom();
                    addNewService();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter again");
                    addNewService();
            }
        }catch (Exception e){
            System.out.println("Enter again");
            addNewService();
        }
    }

    public void showService() {
        System.out.println("Enter your choice:\n" +
                "1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        byte choose = scanner.nextByte();
        switch (choose) {
            case 1:
                villaManage.showVilla();
                showService();
                break;
            case 2:
                houseManage.showRoom();
                showService();
                break;
            case 3:
                roomManage.showRoom();
                showService();
                break;
            case 4:
                showService();
                break;
            case 5:
                showService();
                break;
            case 6:
                showService();
                break;
            case 7:
                showService();
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("Enter again");
                showService();
        }
    }

    public static void main(String[] args) {
        ServiceController serviceController = new ServiceController();
        serviceController.addNewService();
    }
}
