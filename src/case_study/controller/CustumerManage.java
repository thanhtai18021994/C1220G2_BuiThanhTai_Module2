package case_study.controller;

import case_study.common.CustumerException;
import case_study.model.Custumer;
import case_study.model.Services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustumerManage {
    Scanner scanner = new Scanner(System.in);
    private final String EMAIL_REGEX = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
    private final String ID_REGEX = "^[0-9]{3}\\s[0-9]\\s[0-9]$";
    private final String BIRTH_REGEX = "^[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$";
    public CustumerException custumerException=new CustumerException();
    private RoomManage roomManage=new RoomManage();
    private HouseManage houseManage=new HouseManage();
    private VillaManage villaManage=new VillaManage();

    public String formatString(String string) {
        string = string.trim();
        string = string.toLowerCase();
        string = string.replaceAll("\\s+", " ");
        String[] arr = string.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace(arr[i].substring(0, 1), arr[i].substring(0, 1).toUpperCase());
        }
        String line = "";
        for (int i = 0; i < arr.length; i++) {
            line += arr[i] + " ";
        }
        line.trim();
        return line;
    }

    public boolean checkString(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public String addName() {
        System.out.println("Enter name:");
        String name ="";
        while (true){
            try{
                name=scanner.nextLine();
                custumerException.nameException(name);
                return name;
            }catch (CustumerException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public String addBirth(){
        System.out.println("Enter birthday:");
        String birth="";
        while (true){
            try {
                birth=scanner.nextLine();
                custumerException.birthException(birth);
                return birth;
            }catch (CustumerException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public String addEmail() {
        System.out.println("Enter email");
        String email = "";
        while (true) {
            try{
                email = scanner.nextLine();
                custumerException.mailException(email);
                return email;
            }catch (CustumerException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public String addGender() {
        System.out.println("Enter gender");
        String gender = "";
        while (true) {
            try{
                gender = scanner.nextLine();
                gender = gender.toLowerCase();
                gender = gender.replace(gender.substring(0, 1), gender.substring(0, 1).toUpperCase());
                custumerException.GenderException(gender);
            }catch (CustumerException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public String addId() {
        System.out.println("Enter Id:");
        String id = "";
        while (true) {
            try {
                id = scanner.nextLine();
                custumerException.idException(id);
                return id;
            }catch (CustumerException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public String addPhone(){
        System.out.println("Enter phone");
        String phone="";
        while (true){
            try{
                phone=scanner.nextLine();
                custumerException.phoneException(phone);
                return phone;
            }catch (CustumerException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public String addMail(){
        System.out.println("Enter email");
        String email="";
        while (true){
            try{
                email=scanner.nextLine();
                custumerException.mailException(email);
                return email;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public String addTypeCustumer(){
        System.out.println("Enter type custumer");
        String typeCustumer="";
        while (true){
            try{
                typeCustumer=scanner.nextLine();
                custumerException.nameException(typeCustumer);
                return typeCustumer;
            }catch (CustumerException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public String addAdrress(){
        System.out.println("Enter address:");
        String address=scanner.nextLine();
      return address;
    }
    public Services addService(){
        System.out.println("Enter your choice: 1 \n" +
                "1:add room \n" +
                "2:add villa \n" +
                "3:add house \n");
        Services services=null;
        byte choose=scanner.nextByte();
        switch (choose){
            case 1:
               services=roomManage.addRoom();
               break;
            case 2:
                services=villaManage.addVilla();
                break;
            case 3:
                services=houseManage.addHouse();
                break;
            default:
                System.out.println("Enter again");
                addService();
        }
        return services;
    }
    public Custumer createCustumer(){
        String name=addName();
        String birth=addBirth();
        String gender=addGender();
        String id=addId();
        String phone=addPhone();
        String email=addEmail();
        String typeCustumer=addTypeCustumer();
        String address=addAdrress();
        Services services=addService();
        Custumer custumer=new Custumer(name,birth,gender,id,phone,email,typeCustumer,address,services);
        return custumer;
    }
    public void sortCustumer(List<Custumer> list){
        Comparator<Custumer> custumerComparator=Comparator.comparing(Custumer::getName);
        Comparator<Custumer> custumerComparator1=Comparator.comparing(Custumer::convertDate);
        Comparator<Custumer> custumerComparator2=custumerComparator.thenComparing(custumerComparator1);
        Collections.sort(list,custumerComparator2);
    }

    public static void main(String[] args) {
        CustumerManage custumerManage = new CustumerManage();
        System.out.println(custumerManage.formatString(" anh yem    em"));

    }
}
