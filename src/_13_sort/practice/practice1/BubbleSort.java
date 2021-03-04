package _13_sort.practice.practice1;

public class BubbleSort {
    public static void sortArray(int[] array) {
        Boolean check;
        for (int i = 0; i < array.length; i++) {
            check = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            if (!check) {
                break;
            }
        }
        display(array);
    }

    public static void display(int[] array) {
        System.out.print("[");
        for (int iterm : array) {
            System.out.print(iterm + "\t");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
        sortArray(arr);
    }
}
