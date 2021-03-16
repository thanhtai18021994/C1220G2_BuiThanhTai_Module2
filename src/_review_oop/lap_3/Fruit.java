package _review_oop.lap_3;

public class Fruit {
    private static int id;
    private  int id1;
    private String name;
    private double price;
    private int quality;
    private String origin;

    public Fruit(String name, double price, int quality, String origin) {
        this.id1=id++;
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public double getAmount(){
        return quality*price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id1 +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quality='" + quality + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
