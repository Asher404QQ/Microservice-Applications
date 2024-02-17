package ru.kors.productunityservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.kors.productunityservice.model.ProductUnity;

@FeignClient(name = "product-stock-service")
public interface ProductStockClient {
    @GetMapping("/api/check-product-stock/product-name/{productName}/product-availability/{productAvailability}")
    ProductUnity checkProductStock(@PathVariable String productName, @PathVariable String productAvailability);
}
