package seminars.first.hw;

import java.util.*;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public void getSortedListProducts(List<Product> products) {
        List<Product> sortedProducts = sortProductsByPrice(products);
        System.out.println("Отсортированные по цене продукты: ");
        for (int i = 0; i < sortedProducts.size(); i++) {
            System.out.println(i + 1 +  ". " + sortedProducts.get(i));
        }
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct(List<Product> products) {
        int mostExpensiveProductPrice = products.getFirst().getCost();
        Product mostExpensiveProduct = products.getFirst();

        for (int i = 1; i < products.size(); i++) {
            if (products.get(i).getCost() > mostExpensiveProductPrice) {
                mostExpensiveProductPrice = products.get(i).getCost();
                mostExpensiveProduct = products.get(i);
            }
        }
        return mostExpensiveProduct;
    }

    public List sortProductsByPrice(List<Product> products) {
        Product mostExpensiveProduct = getMostExpensiveProduct(products);
        List<Product> sortedProdutctList = new ArrayList<>();
        int productsSize = products.size();

        for (int i = 0; i < productsSize; i++) {
            sortedProdutctList.add(getMostExpensiveProduct(products));
            products.remove(getMostExpensiveProduct(products));
        }

        Set<Product> productsWithoutDuplicates = new HashSet<>(sortedProdutctList);
        productsWithoutDuplicates.clear();
        productsWithoutDuplicates.addAll(sortedProdutctList);

        if (sortedProdutctList.getFirst() != mostExpensiveProduct
            || sortedProdutctList.size() != productsWithoutDuplicates.size()) {
            throw new AssertionError("Сортировка выполнена некорректно!");
        }


        return sortedProdutctList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }


}