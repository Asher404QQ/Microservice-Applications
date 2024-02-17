package ru.kors.productunityservice.model;

import java.math.BigDecimal;

public class ProductStockProxy {
    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private BigDecimal discountOffer;
    private int port;

    public ProductStockProxy(Long id, String productName, BigDecimal productPrice, String productAvailability, BigDecimal discountOffer, int port) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAvailability = productAvailability;
        this.discountOffer = discountOffer;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
    }

    public BigDecimal getDiscountOffer() {
        return discountOffer;
    }

    public void setDiscountOffer(BigDecimal discountOffer) {
        this.discountOffer = discountOffer;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ProductStockProxy{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productAvailability='" + productAvailability + '\'' +
                ", discountOffer=" + discountOffer +
                ", port=" + port +
                '}';
    }
}
