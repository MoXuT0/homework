package groceries;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList {

    private final Set<Product> productList = new HashSet<>();

    public void addProduct(Product product) {
        if (productList.contains(product)) {
            throw new RuntimeException("В списке уже есть " + product.getName());
        } else {
            productList.add(product);
        }
    }

    public static void markAsBought(Product product) {
        product.setBought(true);
        System.out.println(product.getName() + " куплен.");
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public Set<Product> getProductList() {
        return productList;
    }

    public double calculateProductsSum(){
        double sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ProductList that = (ProductList) o;
        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "products=" + productList +
                '}';
    }

}
