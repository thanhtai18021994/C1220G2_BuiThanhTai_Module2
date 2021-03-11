package _16_byte_stream.excercise;

import java.io.Serializable;

public class Product implements Serializable {
    private int productCode;
    private String nameProduct;
    private String productMaker;
    private double price;

    public Product() {
    }

    public Product(int productCode, String nameProduct, String productMaker, double price) {
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.productMaker = productMaker;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProductMaker() {
        return productMaker;
    }

    public void setProductMaker(String productMaker) {
        this.productMaker = productMaker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", nameProduct='" + nameProduct + '\'' +
                ", productMaker='" + productMaker + '\'' +
                ", price=" + price +
                '}';
    }
//    public String showInfor(){
//        return productCode,
//    }
}
