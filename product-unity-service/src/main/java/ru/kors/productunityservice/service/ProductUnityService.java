package ru.kors.productunityservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.kors.productunityservice.client.ProductStockClient;
import ru.kors.productunityservice.model.ProductStockProxy;
import ru.kors.productunityservice.model.ProductUnity;

import java.math.BigDecimal;
import java.util.Objects;

@Service
public class ProductUnityService {
    private final RestTemplate restTemplate;
    private final ProductStockClient client;

    @Autowired
    public ProductUnityService(RestTemplate restTemplate, ProductStockClient client) {
        this.restTemplate = restTemplate;
        this.client = client;
    }

//    public ProductUnity getUnityOfProduct(String productName, String productAvailability, int unit) {
//        ProductStockProxy productStockProxy = restTemplate.getForObject("http://product-stock-service/api/check-product-stock/product-name/{productName}/product-availability/{productAvailability}",
//                ProductStockProxy.class, productName, productAvailability);
//
//        BigDecimal totalPrice = Objects.requireNonNull(productStockProxy).getProductPrice().multiply(BigDecimal.valueOf(unit));
//        BigDecimal totalPriceWithDiscount = totalPrice.subtract(totalPrice.multiply(productStockProxy.getDiscountOffer()));
//
//        return new ProductUnity(productStockProxy.getId(),
//                productStockProxy.getProductName(),
//                totalPrice,
//                totalPriceWithDiscount,
//                productStockProxy.getProductPrice(),
//                productStockProxy.getDiscountOffer(),
//                unit,
//                productStockProxy.getPort());
//    }
    
    public ProductUnity getUnityOfProduct(String productName, String productAvailability, int unit) {
        ProductUnity productUnity = client.checkProductStock(productName, productAvailability);

        BigDecimal totalPrice = Objects.requireNonNull(productUnity).getProductPrice().multiply(BigDecimal.valueOf(unit));
        BigDecimal totalPriceWithDiscount = totalPrice.subtract(totalPrice.multiply(productUnity.getDiscountOffer()));

        return new ProductUnity(productUnity.getId(),
                productUnity.getProductName(),
                totalPrice,
                totalPriceWithDiscount,
                productUnity.getProductPrice(),
                productUnity.getDiscountOffer(),
                unit,
                productUnity.getPort());
    }
    
}
