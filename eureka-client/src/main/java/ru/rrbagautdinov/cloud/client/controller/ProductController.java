package ru.rrbagautdinov.cloud.client.controller;

import ru.rrbagautdinov.cloud.client.entity.Product;
import ru.rrbagautdinov.cloud.client.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/api/v1/products")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

}
