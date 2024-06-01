package less1.practice.impl;

import java.time.LocalDate;

import less1.practice.Product;

public class HotDrink extends Product{
    
    private int temp;
    private String pack;

    public HotDrink(String name, double price, LocalDate releaseDate, int temp) {
        super(name, price, releaseDate);
        this.temp = temp;
        this.pack = EPackage.PAPER.getMaterial();
    }

    public String getPack() {
        return pack;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "температура = " + temp;
    }

}
