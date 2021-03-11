package _00_practice_java.ex1.file_test;

public class main {
    public static void main(String[] args) {
        studentmanager studentmanager = new studentmanager();
//        Scanner scanner = new Scanner(System.in);
//        int choice = Integer.parseInt(scanner.nextLine());
//        while (true){
//            switch (choice){
//                case 1:
//                    studentmanager.addStudent();
//                    System.out.println("Chon lai");
//                    choice = Integer.parseInt(scanner.nextLine());
//                    break;
//                case 2:
//                    System.exit(0);
//            }
//        }
        studentmanager.display();
    }
}
