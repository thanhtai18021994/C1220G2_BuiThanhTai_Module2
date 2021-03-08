package _review_oop.oop_java_2.excercise1;

import java.util.Scanner;

public class Staff extends Officers {
    private String work;

    public Staff(String name, String birth, String address, String gender) {
        super(name, birth, address, gender);
    }

    public Staff(String name, String birth, String address, String gender, String work) {
        super(name, birth, address, gender);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void access() {
        System.out.println("What property would you like access ? \n 1:Name \n 2:birth \n 3:address \n 4: gender \n 5: work \n 6:exit ");
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
                System.out.println("Enter work");
                String work = scanner.nextLine();
                setWork(work);
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
        return "{" + "Name :" + super.getName() + "\n" +
                "Birth:" + super.getBirth() + "\n" +
                "Gender:" + super.getGender() + "\n" +
                "Adress:" + super.getAddress() + "\n" +
                "Work:" + this.getWork() + "}";
    }

    @Override
    public void checkProperty() {

    }
    @Override

    public int compareTo(Officers o) {
        return this.getName().compareTo(o.getName());
    }
}
