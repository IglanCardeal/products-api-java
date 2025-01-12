package io.github.iglancardeal.productsapi.controllers;

import io.github.iglancardeal.productsapi.dto.CreateProductDTO;
import io.github.iglancardeal.productsapi.model.ProductModel;
import io.github.iglancardeal.productsapi.repository.ProductRepository;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductsController {
    private final ProductRepository productRepository;

    public ProductsController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public String get() {
        return "Products";
    }

    @PostMapping
    public String save(@RequestBody CreateProductDTO payload) {
        ProductModel newProduct = new ProductModel();
        newProduct.setName(payload.getName());
        newProduct.setDescription(payload.getDescription());
        newProduct.setPrice(payload.getPrice());
        var uuid = UUID.randomUUID().toString();
        newProduct.setId(uuid);

        productRepository.save(newProduct);

        return uuid;
    }
}
