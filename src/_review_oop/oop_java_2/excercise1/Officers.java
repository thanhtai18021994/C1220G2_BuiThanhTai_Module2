package _review_oop.oop_java_2.excercise1;

import java.util.Date;

public abstract class Officers implements Comparable<Officers> {
    private String name;
    private String birth;
    private String address;
    private String gender;

    public Officers(String name, String birth, String address, String gender) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.gender = gender;
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

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void exit(){
        return;
    }
    public abstract void access();

    public abstract String showInfor();

    public abstract void checkProperty();


}
