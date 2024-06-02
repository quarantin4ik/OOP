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
      
}
