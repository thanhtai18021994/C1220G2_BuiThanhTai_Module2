package _13_sort.practice.practice1;

public class SelectionSort {
    public static void sortArray(int[] array){
        int indexMin,i,j;
        for(i=0;i<array.length;i++){
            indexMin=i;
            for (j=i+1;i<array.length;j++){
                if(array[j]<array[indexMin]){
                    indexMin=j;
                }
            }
            if(indexMin!=i){
                int temp=array[indexMin];
                array[indexMin]=array[i];
                array[i]=temp;
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
}
