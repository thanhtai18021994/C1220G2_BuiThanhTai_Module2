package _00_practice_java;

import java.util.Arrays;

public class TestRegex {
    public static void main(String[] args) {
        String str = "my  name   is tai";
        str = str.toLowerCase();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace(arr[i].substring(0, 1), arr[i].substring(0, 1).toUpperCase());
        }
        System.out.println(Arrays.toString(arr));
        String string = "";
        for (int i = 0; i < arr.length; i++) {
    string=string+arr[i]+" ";
        }
        System.out.println(string);

//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]=="\\s"){
//                str=str.replace(str.substring(i+1,i+2),str.substring(i+1,i+2).toUpperCase());
//                System.out.println(str.substring(i+1,i+2));
//            }
//        }
//        System.out.println(str);

    }
}
