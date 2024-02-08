package ru.kors.productstockservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.kors.productstockservice.model.ProductInfo;
import ru.kors.productstockservice.proxy.ProductInfoProxy;

@RestController
@RequestMapping("/access")
public class ProductInfoController {
    private ProductInfoProxy productInfoProxy;

    @Autowired
    public ProductInfoController(ProductInfoProxy productInfoProxy) {
        this.productInfoProxy = productInfoProxy;
    }

    @GetMapping("/access-product-info")
    public ProductInfo accessProductInfo() {
        refreshActuator();
        return new ProductInfo(productInfoProxy.getName(), productInfoProxy.getDescription());
    }

    private void refreshActuator() {
        String baseURI = "http://localhost:8100/actuator/refresh";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<String> result = restTemplate.postForEntity(baseURI, entity, String.class);
    }
}
