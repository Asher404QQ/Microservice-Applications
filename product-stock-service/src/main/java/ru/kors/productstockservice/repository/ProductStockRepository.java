package ru.kors.productstockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kors.productstockservice.model.ProductStock;

public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {
    ProductStock findByProductNameAndProductAvailability(String productName, String productAvailability);
}
