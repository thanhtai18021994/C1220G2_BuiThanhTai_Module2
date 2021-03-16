package case_study.common;

import case_study.model.Services;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService<R extends Services> extends IOFile {
    Scanner scanner = new Scanner(System.in);

    public String addIdService(String regex) {
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Enter id:");
        String id = "";
        while (true) {
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            boolean check = matcher.matches();
            if (check) {
                return id;
            } else {
                System.out.println("Enter again");
            }
        }
    }

    public String addNameService(String regex) {
        System.out.println("Enter name:");
        Pattern pattern = Pattern.compile(regex);
        while (true) {
            String name = scanner.nextLine();
            Matcher matcher = pattern.matcher(name);
            boolean check = matcher.matches();
            if (check) {
                return name;
            } else {
                System.out.println("Enter again");
            }
        }
    }

    public double addArea() {
        System.out.println("Enter area:");
        double area = 0;
        while (true) {
            try {
                area = Double.parseDouble(scanner.nextLine());
                if (area > 30) {
                    return area;
                } else {
                    System.out.println("Enter again");
                }
            } catch (Exception e) {
                System.out.println("enter again");
            }
        }
    }

    public double addPrice() {
        System.out.println("Enter price:");
        double price = 0;
        while (true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price > 0) {
                    return price;
                } else {
                    System.out.println("enter again");
                }
            } catch (Exception e) {
                System.out.println("enter again");
            }
        }
    }

    public byte addNumberPeopleInRoom() {
        System.out.println("Enter number in room");
        byte number = 0;
        while (true) {
            try {
                number = Byte.parseByte(scanner.nextLine());
                if (number > 0 && number <= 20) {
                    return number;
                } else {
                    System.out.println("Enter again");
                }
            } catch (Exception e) {
                System.out.println("Enter again");
            }
        }
    }

    public int addDayrent() {
        System.out.println("Enter number dayrent:");
        int dayrent = 0;
        while (true) {
            try {
                dayrent = Integer.parseInt(scanner.nextLine());
                if (dayrent > 0) {
                    return dayrent;
                } else {
                    System.out.println("Enter again");
                }
            } catch (Exception e) {
                System.out.println("Enter again");
            }
        }
    }

    public String addTypeRent(String regex) {
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Enter type rent:");
        String typeRent = "";
        while (true) {
            typeRent = scanner.nextLine();
            Matcher matcher = pattern.matcher(typeRent);
            boolean check = matcher.matches();
            if (check) {
                return typeRent;
            } else {
                System.out.println("Enter again");
            }
        }
    }

    public String addRoomStandar(String regex) {
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Enter type standar room:");
        String standar = "";
        while (true) {
            standar = scanner.nextLine();
            Matcher matcher = pattern.matcher(standar);
            boolean check = matcher.matches();
            if (check) {
                return standar;
            } else {
                System.out.println("Enter again");
            }
        }
    }

    public String dicriptOtherService() {
        System.out.println("Enter dicription:");
        String string = scanner.nextLine();
        return string;
    }

    public int addFloor() {
        System.out.println("Enter floor: ");
        int floor = 0;
        while (true) {
            try {
                floor=Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    return floor;
                } else {
                    System.out.println("enter again");
                }
            } catch (Exception e) {
                System.out.println("Enter again!");
            }
        }
    }
    public String addFreeservice(){
        System.out.println("Enter Free service:");
        String freeService=null;
        while (true) {
            freeService = scanner.nextLine();
            freeService = freeService.toLowerCase();
            if (freeService == "massage" || freeService == "karaoke" || freeService == "car" || freeService == "food" || freeService == "drink") {
                return freeService;
            } else {
                System.out.println("enter again");
            }
        }
    }
}
