package com.seanyou.springbootmall.service;

import com.seanyou.springbootmall.constant.ProductCategory;
import com.seanyou.springbootmall.dto.ProductRequest;
import com.seanyou.springbootmall.model.Product;

import java.util.List;


public interface ProductService {

    List<Product> getProducts(ProductCategory category, String sraech);


    Product getProductById(Integer productId);

    Integer createPrdouct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
