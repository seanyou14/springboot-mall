package com.seanyou.springbootmall.rowmapper;

import com.seanyou.springbootmall.model.Product;

import javax.swing.tree.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException{
        Product product =new Product();

        product.setProductId(resultSet.getInt("product_Id"));
        product.setProductName(resultSet.getString("product_name"));


    }
}
