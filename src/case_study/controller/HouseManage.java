package case_study.controller;

import case_study.common.ValidateService;
import case_study.model.House;
import case_study.model.Villa;

import java.util.Arrays;
import java.util.List;

public class HouseManage extends ValidateService {
    private final String ID_HOUSE_REGEX="^SVHO-[0-9]{4}$";
    private final String NAME_REGEX="^[A-Z]\\w+$";
    private final String PATH_HOUSE = "src\\case_study\\data\\House.csv";
    public House addHouse(){
        String id=addIdService(ID_HOUSE_REGEX);
        String name=addNameService(NAME_REGEX);
        double areaRoom=addArea();
        double price=addPrice();
        byte number=addNumberPeopleInRoom();
        int dayRent=addDayrent();
        String typeRent=addTypeRent(NAME_REGEX);
        String standar=addRoomStandar(NAME_REGEX);
        String dicript=dicriptOtherService();
        int floor=addFloor();
        House house=new House(id,name,areaRoom,price,number,dayRent,typeRent,standar,dicript,floor);
        return house;
    }
    public void createHouse(){
        House house=addHouse();
        writeToFile(house,PATH_HOUSE);
    }
    public void showRoom(){
        List<String[]> list=readToFile(PATH_HOUSE);
        for (String[] house:list){
            System.out.println(Arrays.toString(house));
        }
    }

    public static void main(String[] args) {
        HouseManage houseManage=new HouseManage();
        houseManage.showRoom();
    }
}
