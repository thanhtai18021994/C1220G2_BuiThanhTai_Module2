package _011_tree_map.excercise.excercise_1;

import java.lang.reflect.Array;
import java.util.*;

public class ProductManage<E> {


    public static void addProduct(ArrayList<Product> arrayList){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap id");
        int id= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap san Pham");
        String product=sc.nextLine();
        System.out.println("Nhap gia");
        double price=sc.nextDouble();
        Product myproduct=new Product(id,product,price);
        arrayList.add(myproduct);
    }
    public static void editProduct(ArrayList<Product> arrayList){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vij tri muon sua");
        int index= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap id");
        int id= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap san Pham");
        String product=sc.nextLine();
        System.out.println("Nhap gia");
        double price=sc.nextDouble();
        Product myproduct=new Product(id,product,price);
        arrayList.set(index,myproduct);
    }
    public static void deleteProduct(ArrayList<Product> arrayList){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vij tri muon xoa");
        int index= Integer.parseInt(sc.nextLine());
        arrayList.remove(index);
    }
    public static void displayproduct(LinkedList<Product> linkedList){
        for (Product product:linkedList){
            System.out.println(product);
        }
    }
    public static void searchproduct(LinkedList<Product> linkedList){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vij tri muon sua");
        String product= sc.nextLine();
        for(Product product1:linkedList){
            if(product1.getPrduct()==product){
                System.out.println(product1.toString());
            }
        }
    }

    public static void sortProduct(LinkedList<Product>linkedList){
        Collections.sort(linkedList);
    }
    
    public static void main(String[] args) {

            ArrayList<Product> products1=new ArrayList<Product>();
            products1.add(new Product(1,"milk",34.000));
            products1.add(new Product(2,"sugar",134.000));
            products1.add(new Product(3,"salt",324.000));
            products1.add(new Product(4,"rice",354.000));
            addProduct(products1);
            for (Product productManage1:products1){
                System.out.println(productManage1);
            }
    }
}
