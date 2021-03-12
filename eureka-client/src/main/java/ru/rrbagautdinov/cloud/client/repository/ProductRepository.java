package ru.rrbagautdinov.cloud.client.repository;

import ru.rrbagautdinov.cloud.client.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
