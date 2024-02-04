package seminars.first.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct +
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов +
    */

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Product(60, "Apple"),
                new Product(50, "Banana"),
                new Product(150, "Truffle")
        ));
        Shop shop = new Shop();
        shop.setProducts(productList);

        System.out.println("Самый дорогой продукт:\n" + shop.getMostExpensiveProduct(productList) + "\n");

        shop.getSortedListProducts(productList);
    }
}




