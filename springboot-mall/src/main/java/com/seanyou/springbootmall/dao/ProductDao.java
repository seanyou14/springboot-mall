package com.seanyou.springbootmall.dao;

import com.seanyou.springbootmall.dto.ProductRequest;
import com.seanyou.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {


    List<Product> getProducts();
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
