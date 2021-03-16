package case_study.model;

public class Room extends Services{
    private String freeService;

    public Room(String id, String nameService, double areaRoom, double price, byte people_in_room, int dateRent,String typeRent, String freeService) {
        super(id, nameService, areaRoom, price, people_in_room, dateRent,typeRent);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
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
                getFreeService();
    }
}
