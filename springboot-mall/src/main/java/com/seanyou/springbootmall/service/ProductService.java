package com.seanyou.springbootmall.service;

import com.seanyou.springbootmall.dto.ProductRequest;
import com.seanyou.springbootmall.model.Product;



public interface ProductService {

    Product getProductById(Integer productId);

    Integer createPrdouct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
