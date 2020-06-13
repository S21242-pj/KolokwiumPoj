package pjatk.pl;

public class Product {
    private int productId;
    private String productName;
    private int productPrice;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        validatePrice(productPrice);
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public boolean hasProductIdOf(int productId){
        return getProductId() == productId;
    }
    private void validatePrice(int productPrice){
        if(productPrice < 6){
            throw new IllegalArgumentException("Product cant be sold for 0$ or less!!!");
        }

    }



    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + productPrice +
                '}';
    }
}
