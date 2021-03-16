package case_study.model;

public class House extends Services {
    private String roomStandar;
    private String dicription_other_service;
    private int floor;

    public House(String roomStandar, String dicription_other_service, int floor) {
        this.roomStandar = roomStandar;
        this.dicription_other_service = dicription_other_service;
        this.floor = floor;
    }

    public House(String id, String nameService, double areaRoom, double price, byte people_in_room, int dateRent,String typeRent, String roomStandar, String dicription_other_service, int floor) {
        super(id, nameService, areaRoom, price, people_in_room, dateRent,typeRent);
        this.roomStandar = roomStandar;
        this.dicription_other_service = dicription_other_service;
        this.floor = floor;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public String getDicription_other_service() {
        return dicription_other_service;
    }

    public void setDicription_other_service(String dicription_other_service) {
        this.dicription_other_service = dicription_other_service;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    @Override
    public String showInfor(){
        return super.getId()+","+
                super.getNameService()+","+
                super.getPrice()+","+
                super.getAreaRoom()+","+
                super.getDateRent()+","+
                super.getTypeRent()+","+
                super.getPeople_in_room()+","+
                getRoomStandar()+","+
                getDicription_other_service()+","+
                getFloor();
    }

    @Override
    public String toString() {
        return super.toString()+"House{" +
                "roomStandar='" + roomStandar + '\'' +
                ", dicription_other_service='" + dicription_other_service + '\'' +
                ", floor=" + floor +
                '}';
    }
}
