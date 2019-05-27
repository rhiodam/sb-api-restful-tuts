package com.rhiodamuthie.sbapirestful.service;

import com.rhiodamuthie.sbapirestful.model.Product;

public interface ProductService {
    Iterable<Product> getAllProducts();

    Product getProduct(long id);

    Product save(Product p);
}
