package _12_search_alrogithm.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optional3 {
    public static List<Byte> addArr(List<Byte> arrayList, byte c) {
        arrayList.add(c);
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<Byte> listmax = new ArrayList<>();
        List<Byte> listtemp = new ArrayList<>();
        byte[] arr = string.getBytes();
        listtemp.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                addArr(listtemp, arr[i]);
            } else {
                if (listtemp.size() > listmax.size()) {
                    listmax.clear();
                    listmax.addAll(listtemp);
                }
                listtemp.clear();
                addArr(listtemp, arr[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int b;
        for (int i = 0; i < listmax.size(); i++) {
            b = listmax.get(i);
            stringBuilder.append((char) b);
        }
        System.out.println(stringBuilder.toString());
    }
}
