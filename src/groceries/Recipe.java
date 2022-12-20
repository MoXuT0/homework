package groceries;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {

    private final Map<Product, Double> productList = new HashMap<>();
    private String name;

    public Recipe(String name) {
        setName(name);
    }

    public void addProduct(Product product, Double amount) {
        if (amount == null || amount.isNaN() || amount <= 1.0) {
            amount = 1.0;
        }
        if (!this.productList.containsKey(product)) {
            this.productList.put(product, amount);
        } else {
            this.productList.replace(product, amount);
        }
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }


    public Map<Product, Double> getProductList() {
        return productList;
    }

    public double getRecipeSum() {
        double sum = 0;
        for (Map.Entry<Product, Double> product : this.productList.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните название рецепта");
        } else {
            this.name = name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productList=" + productList +
                ", productsSum=" + getRecipeSum() +
                ", name='" + name + '\'' +
                '}';
    }

}
