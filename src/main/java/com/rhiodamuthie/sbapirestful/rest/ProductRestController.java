package com.rhiodamuthie.sbapirestful.rest;


import com.rhiodamuthie.sbapirestful.model.Product;
import com.rhiodamuthie.sbapirestful.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    private ProductServiceImpl productService;

    // productService constructor injection

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}
