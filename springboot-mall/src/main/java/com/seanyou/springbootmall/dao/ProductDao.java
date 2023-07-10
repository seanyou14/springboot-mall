package com.seanyou.springbootmall.dao;

import com.seanyou.springbootmall.dto.ProductRequest;
import com.seanyou.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
