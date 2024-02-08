package ru.kors.productstockservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import ru.kors.productstockservice.model.ProductStock;
import ru.kors.productstockservice.proxy.ProductStockProxy;
import ru.kors.productstockservice.repository.ProductStockRepository;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class ProductStockController {
    private final ProductStockRepository repository;
    private final Environment environment;

    @Autowired
    public ProductStockController(ProductStockRepository repository, Environment environment) {
        this.repository = repository;
        this.environment = environment;
    }

    @PostMapping("/new-product")
    public ProductStock addProductStock(@RequestBody ProductStock productStock) {
        repository.save(productStock);
        return  productStock;
    }

    @GetMapping("/check-product-stock/product-name/{productName}/product-availability/{productAvailability}")
    public ProductStockProxy checkProductStock(@PathVariable String productName, @PathVariable String productAvailability) {
        ProductStock productStock = repository.findByProductNameAndProductAvailability(productName, productAvailability);
        return new ProductStockProxy(productStock.getId(),
                productName,
                productStock.getProductPrice(),
                productAvailability,
                productStock.getDiscountOffer(),
                Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))));
    }
}
