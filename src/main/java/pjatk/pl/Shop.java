package pjatk.pl;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int shopId;
    private String shopName;
   // private List<Shop> availbeProducts = new ArrayList<Shop>();
 //   private List<Shop> soldProducts = new ArrayList<Shop>();

    public Shop(int shopId, String shopName) {
        this.shopId = shopId;
        validateShopName(shopName);
        this.shopName = shopName;
    }

    private void validateShopName(String shopName){
        if(shopName.length()<6){
            throw new IllegalArgumentException("Shop name is too short! " +
                    "It must be more than 6 character and remeber without numbers!!" +
                    "Actually your shop name have:" + shopName.length());
        }
        char[] symbols = shopName.toCharArray();
        for(char symbol:symbols){
            if(Character.isDigit(symbol)){
                throw new IllegalArgumentException("Numbers in shop name!!");
            }
        }




    }


    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
       //         ", availbeProducts=" + availbeProducts +
         //       ", soldProducts=" + soldProducts +
                '}';
    }
}


