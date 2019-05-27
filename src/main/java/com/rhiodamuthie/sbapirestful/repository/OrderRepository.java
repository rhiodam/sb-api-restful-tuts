package com.rhiodamuthie.sbapirestful.repository;

import com.rhiodamuthie.sbapirestful.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
