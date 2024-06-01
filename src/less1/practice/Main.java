package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrink;
import less1.practice.impl.HotDrinksVendingMachine;
import less1.practice.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1), false, null, 0.5F, 21);

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F, 20);

        Product cup1 = new HotDrink("Coffee", 100, LocalDate.now(), 90, EPackage.PAPER.getMaterial(), 0.2F);
        Product cup2 = new HotDrink("CoffeeLate", 150, LocalDate.now(), 80, EPackage.PAPER.getMaterial(), 0.22F);

        // VendingMachine vm = new WaterVendingMachine();

        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        // System.out.println(vm.getProducts());

        // vm.getProduct("Родники");

        // System.out.println(vm.getProducts());

        VendingMachine hvm = new HotDrinksVendingMachine();
        hvm.addProducts(List.of(cup1, cup1, cup2, cup1, cup2));
        System.out.println(hvm.getProducts());
        hvm.getProduct("Coffee", 0.2F, 90);
        hvm.getProduct("Coffee", 0.2F, 91);
        hvm.getProduct("Coffee", 0.2F, 90);
        hvm.getProduct("CoffeeLate", 0.22F, 90);
        hvm.getProduct("CoffeeLate", 0.22F, 80);
        System.out.println(hvm.getProducts());


    }
}
