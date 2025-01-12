package io.github.iglancardeal.productsapi.repository;

import io.github.iglancardeal.productsapi.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, String> {
}
