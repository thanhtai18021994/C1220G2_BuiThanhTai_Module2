package _12_search_alrogithm.optional;

public class Optional2 {
    public static int searchBinaryTree(int[] arr, int left, int right, int key) {
        if (left <= right) {
            int mid = (right + left) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
                return searchBinaryTree(arr, left, right, key);
            } else if (key == arr[mid]) {
                return mid;
            } else {
                left = mid + 1;
                return searchBinaryTree(arr,left,right,key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6};
        System.out.println(searchBinaryTree(arr,0,arr.length-1,6));
    }
}
