package io.github.iglancardeal.productsapi.controllers;

import io.github.iglancardeal.productsapi.dto.CreateProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductsController {
    @GetMapping
    public String get() {
        return "Products";
    }

    @PostMapping
    public CreateProductDTO save(@RequestBody CreateProductDTO payload) {
        System.out.println("Product: " + payload);
        return (payload);
    }
}
