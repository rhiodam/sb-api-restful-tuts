package com.rhiodamuthie.sbapirestful.service;

import com.rhiodamuthie.sbapirestful.model.Order;

public interface OrderService {
    Iterable<Order> getAllOrders();

    Order create(Order order);

    void update(Order order);
}
