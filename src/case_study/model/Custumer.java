package case_study.model;

import java.time.LocalDate;
import java.util.List;

public class Custumer{
    private String name;
    private String birth;
    private String gender;
    private String id;
    private String phone;
    private String email;
    private String typeCustumer;
    private String address;
    private Services services;

    public Custumer(String name, String birth, String gender, String id, String phone, String email, String typeCustumer, String address, Services services) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.typeCustumer = typeCustumer;
        this.address = address;
        this.services = services;
    }

    public Custumer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }
    public LocalDate convertDate(){
        String[] arr=getBirth().split("/");
        int day=Integer.parseInt(arr[0]);
        int month=Integer.parseInt(arr[1]);
        int year=Integer.parseInt(arr[2]);
        return LocalDate.of(year,month,day);
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustumer() {
        return typeCustumer;
    }

    public void setTypeCustumer(String typeCustumer) {
        this.typeCustumer = typeCustumer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
    public String showInfor(){
        return getName()+","+
                getBirth()+","+
                getGender()+","+
                getId()+","+
                getPhone()+","+
                getEmail()+","+
                getTypeCustumer()+','+
                getAddress()+","+
                getServices();
    }

    @Override
    public String toString() {
        return "Custumer{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", typeCustumer='" + typeCustumer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                '}';
    }

    @Override
    public int compareTo(Custumer o) {
        return getName().compareTo(o.getName()) ;
    }
}
