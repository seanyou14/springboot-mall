package com.seanyou.springbootmall.service.impl;


import com.seanyou.springbootmall.dao.ProductDao;
import com.seanyou.springbootmall.dto.ProductRequest;
import com.seanyou.springbootmall.model.Product;
import com.seanyou.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {

        return  productDao.getProductById(productId);
    }

    @Override
    public Integer createPrdouct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }


}
