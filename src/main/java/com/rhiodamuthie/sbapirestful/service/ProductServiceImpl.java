package com.rhiodamuthie.sbapirestful.service;

import com.rhiodamuthie.sbapirestful.exception.ResourceNotFoundException;
import com.rhiodamuthie.sbapirestful.model.Product;
import com.rhiodamuthie.sbapirestful.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    // productRepository constructor injection

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        try {
            return productRepository
                    .findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
