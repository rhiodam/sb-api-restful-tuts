package com.rhiodamuthie.sbapirestful.repository;

import com.rhiodamuthie.sbapirestful.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {

}
