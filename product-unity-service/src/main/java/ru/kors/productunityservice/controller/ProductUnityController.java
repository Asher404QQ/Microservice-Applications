package ru.kors.productunityservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kors.productunityservice.model.ProductUnity;
import ru.kors.productunityservice.service.ProductUnityService;

@RestController
@RequestMapping("/api")
public class ProductUnityController {
    private final ProductUnityService service;

    @Autowired
    public ProductUnityController(ProductUnityService service) {
        this.service = service;
    }

    @GetMapping("/product-unity/name/{name}/availability/{availability}/unit/{unit}")
    public ProductUnity getUnityOfProduct(@PathVariable String name,
                                          @PathVariable String availability,
                                          @PathVariable int unit) {
        return service.getUnityOfProduct(name, availability, unit);
    }
}
