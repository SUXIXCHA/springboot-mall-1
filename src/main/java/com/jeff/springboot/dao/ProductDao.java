package com.jeff.springboot.dao;

import com.jeff.springboot.model.Product;

public interface ProductDao {

    Product getProductById (Integer productId);
}
