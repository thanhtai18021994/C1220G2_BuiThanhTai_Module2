package _00_practice_java.casting;

public class Animal {
    private String live;

    public Animal(String live) {
        this.live = live;
    }


    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "live='" + live + '\'' +
                '}';
    }
}
