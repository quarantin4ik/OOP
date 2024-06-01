package less1.practice.impl;

import java.time.LocalDate;

import less1.practice.Product;

public class HotDrink extends Product{
    
    private String pack;

    public HotDrink(String name, double price, LocalDate releaseDate, int temp, String pack, float volume) {
        super(name, price, releaseDate, volume, temp);
        this.pack = EPackage.PAPER.getMaterial();
    }

    public String getPack() {
        return pack;
    }

    

    @Override
    public String toString() {
        return "ГорячийНапиток - " +
                "название " + name + 
                ", цена = " + price +
                ", дата изготовления " + releaseDate +
                ", объём " + volume +
                ", упаковка " + pack + 
                ", температура " + temp
                ;
    }

}
