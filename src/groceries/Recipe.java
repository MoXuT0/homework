package groceries;

import java.util.Objects;

public class Recipe {

    private final ProductList productList;
    private final double productsSum;
    private String name;

    public Recipe(ProductList productList,
                  String name) {
        this.productList = productList;
        this.productsSum = productList.calculateProductsSum();
        setName(name);
    }

    public ProductList getProductList() {
        return productList;
    }

    public double getProductsSum() {
        return productList.calculateProductsSum();
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
                ", productsSum=" + productsSum +
                ", name='" + name + '\'' +
                '}';
    }

}
