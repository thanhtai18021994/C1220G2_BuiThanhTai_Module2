package case_study.model;

public class Villa extends Services{
    private String roomStandar;
    private String dicription_other_service;
    private double arePool;
    private int floor;

    public Villa(String id, String nameService, double areaRoom, double price, byte people_in_room, int dateRent,String typeRent, String roomStandar, String dicription_other_service, double arePool, int floor) {
        super(id, nameService, areaRoom, price, people_in_room, dateRent,typeRent);
        this.roomStandar = roomStandar;
        this.dicription_other_service = dicription_other_service;
        this.arePool = arePool;
        this.floor = floor;
    }

    public Villa(String roomStandar, String dicription_other_service, double arePool, int floor) {
        this.roomStandar = roomStandar;
        this.dicription_other_service = dicription_other_service;
        this.arePool = arePool;
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

    public double getArePool() {
        return arePool;
    }

    public void setArePool(double arePool) {
        this.arePool = arePool;
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
                getArePool()+","+
                getFloor();
    }

    @Override
    public String toString() {
        return super.toString()+"Villa{" +
                "roomStandar='" + roomStandar + '\'' +
                ", dicription_other_service='" + dicription_other_service + '\'' +
                ", arePool=" + arePool +
                ", floor=" + floor +
                '}';
    }
}
