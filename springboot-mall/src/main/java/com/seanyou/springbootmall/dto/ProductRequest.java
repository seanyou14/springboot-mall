package com.seanyou.springbootmall.dto;

import com.seanyou.springbootmall.constant.ProductCategory;

import  javax.validation.constraints.NotNull;


public class ProductRequest {
//前端需要回傳以下參數

        @NotNull
        private String productName;

        @NotNull
        private ProductCategory category;

        @NotNull
        private String imageUrl;

        @NotNull
        private Integer price;

        @NotNull
        private Integer stock;

    private String description;

    // description 資料庫設定可以為null
//    private Date createdDate;
//    private Date lastModifiedDate;
//springboot 設定好時間 不需前端回傳


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
