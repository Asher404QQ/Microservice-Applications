package ru.kors.productunityservice.model;

import java.math.BigDecimal;

public class ProductUnity {
    private Long id;
    private String productName;
    private BigDecimal totalPrice;
    private BigDecimal totalPriceWithDiscount;
    private BigDecimal productPrice;
    private BigDecimal discountOffer;
    private int unity;
    private int port;

    public ProductUnity(Long id, String productName, BigDecimal totalPrice, BigDecimal totalPriceWithDiscount, BigDecimal productPrice, BigDecimal discountOffer, int unity, int port) {
        this.id = id;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.totalPriceWithDiscount = totalPriceWithDiscount;
        this.productPrice = productPrice;
        this.discountOffer = discountOffer;
        this.unity = unity;
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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPriceWithDiscount() {
        return totalPriceWithDiscount;
    }

    public void setTotalPriceWithDiscount(BigDecimal totalPriceWithDiscount) {
        this.totalPriceWithDiscount = totalPriceWithDiscount;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getDiscountOffer() {
        return discountOffer;
    }

    public void setDiscountOffer(BigDecimal discountOffer) {
        this.discountOffer = discountOffer;
    }

    public int getUnity() {
        return unity;
    }

    public void setUnity(int unity) {
        this.unity = unity;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ProductUnity{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", totalPrice=" + totalPrice +
                ", totalPriceWithDiscount=" + totalPriceWithDiscount +
                ", productPrice=" + productPrice +
                ", discountOffer=" + discountOffer +
                ", unity=" + unity +
                ", port=" + port +
                '}';
    }
}
