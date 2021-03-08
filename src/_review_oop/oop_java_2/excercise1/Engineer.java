package _review_oop.oop_java_2.excercise1;

import java.net.SecureCacheResponse;
import java.util.Date;
import java.util.Scanner;

public class Engineer extends Officers {
    private String major;

    public Engineer(String name, String birth, String address, String gender) {
        super(name, birth, address, gender);
    }

    public Engineer(String name, String birth, String address, String gender, String major) {
        super(name, birth, address, gender);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    @Override
    public void access() {
        System.out.println("What property would you like access ? \n 1:Name \n 2:birth \n 3:address \n 4: gender \n 5: major \n 6:exit ");
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Enter name");
                String name = scanner.nextLine();
                setName(name);
                access();
                break;
            case 2:
                System.out.println("Enter birth");
                String birth = scanner.nextLine();
                setBirth(birth);
                access();
                break;
            case 3:
                System.out.println("Enter address");
                String address = scanner.nextLine();
                setAddress(address);
                access();
                break;
            case 4:
                System.out.println("Enter gender");
                String gender = scanner.nextLine();
                setGender(gender);
                access();
                break;
            case 5:
                System.out.println("Enter major");
                String major = scanner.nextLine();
                setMajor(major);
                access();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Enter again");
        }
    }

    @Override
    public String showInfor() {
        return "{"+"Name :"+super.getName()+"\n"+
                "Birth:"+super.getBirth()+"\n"+
                "Gender:" +super.getGender()+"\n"+
                "Adress:"+super.getAddress()+"\n"+
                "Major:"+this.getMajor()+"}";
    }

    @Override
    public void checkProperty() {

    }

    @Override
    public int compareTo(Officers o) {
        return this.getName().compareTo(o.getName());
    }
}
