package _011_tree_map.excercise.excercise_1;

public class Product implements Comparable<Product> {
    private int ID;
    private String prduct;
    private double price;

    public Product(int ID, String prduct, double price) {
        this.ID = ID;
        this.prduct = prduct;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrduct() {
        return prduct;
    }

    public void setPrduct(String prduct) {
        this.prduct = prduct;
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
                "ID=" + ID +
                ", prduct='" + prduct + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.getPrice() == o.getPrice()) {
            return this.getPrduct().compareTo(o.getPrduct());
        } else if (this.getPrice() > o.getPrice()) {
            return 1;
        } else return -1;
    }
}
