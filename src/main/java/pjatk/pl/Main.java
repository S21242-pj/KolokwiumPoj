package pjatk.pl;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop(1234, "SklepShop");
        Product product1 = new Product(1001, "Jim Beam", 100);

        System.out.println(shop1);
        System.out.println(product1);

        System.out.println("Add Jim Beam to the avaible product list");
        shop1.addProductsToList(product1);


    }
}
