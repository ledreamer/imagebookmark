package satyaki.com.imagebookmark;

/**
 * Created by satyaki on 2/11/15.
 */
import android.content.res.Resources;

import java.util.List;
import java.util.Vector;

public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    public static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("Clothes", res
                    .getDrawable(R.drawable.deadoralive),
                    "ShirtPantPair", 29.99));
            catalog.add(new Product("Clothes", res
                    .getDrawable(R.drawable.switchbook),
                    "ShirtPantPair", 24.99));
            catalog.add(new Product("Clothes", res
                    .getDrawable(R.drawable.watchmen),
                    "ShirtPantPair", 14.99));
        }

        return catalog;
    }

    public static List<Product> getCart() {
        if(cart == null) {
            cart = new Vector<Product>();
        }

        return cart;
    }

}