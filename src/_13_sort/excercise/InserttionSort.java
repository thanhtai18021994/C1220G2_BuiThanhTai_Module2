package _13_sort.excercise;

public class InserttionSort {
    public static void insertSort( int[] arr){
        int holePosiztion;
        int valueInsertion;
        int i;
        for(i=1;i<arr.length;i++){
            valueInsertion=arr[i];
            holePosiztion=i;
            while (holePosiztion>0&&arr[holePosiztion-1]>valueInsertion){
                arr[holePosiztion]=arr[holePosiztion-1];
                holePosiztion--;
            }
            if (holePosiztion!=i){
                arr[holePosiztion]=valueInsertion;
                display(arr);
            }

        }
        display(arr);
    }
    public static void display(int[] array) {
        System.out.print("[");
        for (int iterm : array) {
            System.out.print(iterm + "\t");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,0};
        insertSort(arr);
    }

}
