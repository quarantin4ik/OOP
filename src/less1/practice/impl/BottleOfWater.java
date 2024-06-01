package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {

    private float volume;
    private String pack;
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate, float volume, int temp) {
        super(name, price, releaseDate, volume, temp);
        this.isSpark = false;
        this.volume = 1;
        this.pack = EPackage.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean spark, String pack, float volume, int temp) {
        super(name, price, releaseDate, volume, temp);
        this.isSpark = false;
        this.volume = volume;
        this.pack = pack;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "Бутылка воды - " +
                "название " + name + 
                ", цена = " + price +
                ", дата изготовления " + releaseDate +
                ", объём " + volume +
                ", упаковка " + pack + 
                ", температура " + temp +
                ", газ/без " + isSpark;
    }
}
