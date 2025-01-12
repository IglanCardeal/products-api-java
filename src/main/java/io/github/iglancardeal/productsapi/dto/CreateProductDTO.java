package io.github.iglancardeal.productsapi.dto;

public class CreateProductDTO {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    String name;
    Double price;

    @Override
    public String toString() {
        return "CreateProductDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
