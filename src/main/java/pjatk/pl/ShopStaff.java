package pjatk.pl;

import java.util.Optional;

public class ShopStaff {
    private Shop shop;

    public ShopStaff(Shop shop) {
        this.shop = shop;
    }

    public ShopStaff() {

    }


    /**
     *  Find product ID
     */

    private Optional<Product> findProductInShopById(int productId){
        for (Product product: shop.getAvailbeProducts()) {
            if (product.hasProductIdOf(productId)){
                return Optional.of(product);
            }
        }return Optional.empty();
     }


    /**
     * Trying to do 3.1 with lambda, i guess i could do that, but it wastes my time
     */

      public void findProductId(int productId) {
          shop.getAvailbeProducts().stream().filter(c -> c.getProductId() == productId).findFirst();
      }


/**
    private Optional<Product> findProductInCustomer(int productId, Client client){

    }
*/

}
