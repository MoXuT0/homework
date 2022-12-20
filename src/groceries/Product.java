package groceries;

import java.util.Objects;

public class Product {

    private String name;
    private Double price;
    private Double weight;
    private boolean isBought;

    public Product() {
        this(null,
                null,
                null);
    }

    public Product(String name,
                   Double price,
                   Double weight) {
        setName(name);
        setPrice(price);
        setWeight(weight);
        this.isBought = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price == null || price < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight == null || weight < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.weight = weight;
        }
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return name.equals(product.name) && price.equals(product.price) && weight.equals(product.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

}
