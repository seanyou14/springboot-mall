package com.seanyou.springbootmall.dao;

import com.seanyou.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
