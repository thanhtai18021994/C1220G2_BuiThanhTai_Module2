package case_study.controller;

import case_study.common.ServiceException;
import case_study.common.ValidateService;
import case_study.model.Villa;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VillaManage extends ValidateService {
    Scanner scanner = new Scanner(System.in);
    private final String VILLA_PATH = "src\\case_study\\data\\Villa.csv";
    private final String VILLA_REGEX = "^[A-Z]\\w+$";
    private final String IDVILLA_REGEX = "^SVVI-[0-9]{4}$";
    public Villa addVilla(){
        String id = addIdService(IDVILLA_REGEX);
        String name = addNameService(VILLA_REGEX);
        double areaRoom = addArea();
        double price = addPrice();
        byte number = addNumberPeopleInRoom();
        int dayRent = addDayrent();
        String typeRent = addTypeRent(VILLA_REGEX);
        String standar = addRoomStandar(VILLA_REGEX);
        String dicript = dicriptOtherService();
        double areaPool = addArea();
        int floor = addFloor();
        Villa villa = new Villa(id, name, areaRoom, price, number, dayRent, typeRent, standar, dicript, areaPool, floor);
        return villa;
    }

    public void createVilla() {
        Villa villa=addVilla();
        writeToFile(villa, VILLA_PATH);
    }

    public void showVilla() {
        List<String[]> list = readToFile(VILLA_PATH);
        for (String[] s : list) {
            System.out.println(Arrays.toString(s));
        }
    }

    public static void main(String[] args) {
        VillaManage villaManage = new VillaManage();
        villaManage.showVilla();
    }

}
