public class PrimeNumber2 {
    public static void main(String[] args) {
        int number = 3;
        System.out.print(2);
        System.out.print(" ");
        while (number <= 100) {
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
            }
            number++;
        }
    }
}
