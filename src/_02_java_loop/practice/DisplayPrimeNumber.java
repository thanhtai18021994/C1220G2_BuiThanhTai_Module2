public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int number = 3;
        int count = 1;
        System.out.print(2);
        System.out.print(" ");
        while (count <= 20) {
            boolean check = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check==true) {
                System.out.print(number);
                System.out.print(" ");
                count++;
            }
            number++;
        }
    }
}
