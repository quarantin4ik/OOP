package less1.practice;

import java.time.LocalDate;

public class Product {

    protected String name;
    protected double price;
    protected LocalDate releaseDate;
    protected float volume;
    protected int temp;

    public Product(String name, double price, LocalDate releaseDate, float volume, int temp) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.volume = volume;
        this.temp = temp;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getTemp() {
        return temp;
    }
    
    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
