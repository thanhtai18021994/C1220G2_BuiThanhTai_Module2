package case_study.controller;

import case_study.common.ValidateService;
import case_study.model.House;
import case_study.model.Room;

import java.util.List;

public class RoomManage extends ValidateService {
    private final String PATH_ROOM = "src\\_case_study\\main\\data\\Room.csv";
    private final String ID_HOUSE_REGEX = "^SVRO-[0-9]{4}$";
    private final String NAME_REGEX = "^[A-Z]\\w+$";

    public Room addRoom() {
        String id = addIdService(ID_HOUSE_REGEX);
        String name = addNameService(NAME_REGEX);
        double areaRoom = addArea();
        double price = addPrice();
        byte number = addNumberPeopleInRoom();
        int dayRent = addDayrent();
        String typeRent = addTypeRent(NAME_REGEX);
        String standar = addRoomStandar(NAME_REGEX);
        String dicript = dicriptOtherService();
        int floor = addFloor();
        String freeService = addFreeservice();
        Room room = new Room(id, name, areaRoom, price, number, dayRent, typeRent, freeService);
        return room;
    }

    public void createRoom() {
        Room room = addRoom();
        writeToFile(room, PATH_ROOM);
    }

    public void showRoom() {
        List<String[]> list = readToFile(PATH_ROOM);
        for (String[] room : list) {
            System.out.println(room);
        }
    }

}
