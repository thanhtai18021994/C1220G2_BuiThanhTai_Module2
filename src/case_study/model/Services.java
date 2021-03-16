package case_study.model;

public abstract class Services {
    private String id;
    private String nameService;
    private double areaRoom;
    private double price;
    private byte people_in_room;
    private String typeRent;
    private int dateRent;

    public Services(String id, String nameService, double areaRoom, double price, byte people_in_room, int dateRent,String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.areaRoom = areaRoom;
        this.price = price;
        this.people_in_room = people_in_room;
        this.dateRent = dateRent;
        this.typeRent=typeRent;
    }

    public Services() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaRoom() {
        return areaRoom;
    }

    public void setAreaRoom(double areaRoom) {
        this.areaRoom = areaRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getPeople_in_room() {
        return people_in_room;
    }

    public void setPeople_in_room(byte people_in_room) {
        this.people_in_room = people_in_room;
    }

    public int getDateRent() {
        return dateRent;
    }

    public void setDateRent(int dateRent) {
        this.dateRent = dateRent;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInfor();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaRoom=" + areaRoom +
                ", price=" + price +
                ", people_in_room=" + people_in_room +
                ", dateRent='" + dateRent + '\'' +
                '}';
    }
}
