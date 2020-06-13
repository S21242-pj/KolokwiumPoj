package pjatk.pl;

import java.lang.NullPointerException;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop(1234, "SklepShop");
        Product product1 = new Product(1001, "Jim Beam", 100);

        System.out.println(shop1);
        System.out.println(product1);

        System.out.println("\nAdd Jim Beam to the avaible product list");
        shop1.addProductsToList(product1);
        System.out.println("Jim Beam is avaible on the product list");

        // New object of ShopStuff <-- service

        ShopStaff shopStaff = new ShopStaff(shop1);

        // Lambda

        shopStaff.findProductId(100);


    }
}
