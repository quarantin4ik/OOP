package less1.practice.impl;

import java.util.List;

import less1.practice.Product;
import less1.practice.VendingMachine;

public class HotDrinksVendingMachine extends VendingMachine {
    public HotDrinksVendingMachine() {
        super();
    }
    
    public HotDrinksVendingMachine(List<Product> products) {
        super(products);
    }
    
    @Override
    public Product getProduct(String name, float volume, int temp) {



        for (Product product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemp() == temp) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name + volume + temp);
        return null;
    }
}
