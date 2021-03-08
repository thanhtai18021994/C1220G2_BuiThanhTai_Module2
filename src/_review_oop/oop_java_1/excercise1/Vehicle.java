package _review_oop.oop_java_1.excercise1;

public class Vehicle {
    private int cylinderCapacity;
    private int priceVehicle;

    public Vehicle(int cylinderCapacity, int priceVehicle) {
        this.cylinderCapacity = cylinderCapacity;
        this.priceVehicle = priceVehicle;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getPriceVehicle() {
        return priceVehicle;
    }

    public void setPriceVehicle(int priceVehicle) {
        this.priceVehicle = priceVehicle;
    }


    public double countTax() {
        double tax;
        if (cylinderCapacity < 100) {
            tax = getPriceVehicle() / 100;
        } else if (cylinderCapacity >= 100 && cylinderCapacity <= 200) {
            tax = 3 * getPriceVehicle() / 100;
        } else {
            tax = 5 * getPriceVehicle() / 100;
        }
        return tax;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "cylinderCapacity=" + cylinderCapacity +
                ", priceVehicle=" + priceVehicle +
                '}';
    }
}
