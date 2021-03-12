package ru.rrbagautdinov.cloud.client.service;

import ru.rrbagautdinov.cloud.client.entity.Product;
import ru.rrbagautdinov.cloud.client.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
