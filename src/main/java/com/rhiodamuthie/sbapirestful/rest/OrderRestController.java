package com.rhiodamuthie.sbapirestful.rest;

import com.rhiodamuthie.sbapirestful.dto.OrderForm;
import com.rhiodamuthie.sbapirestful.dto.OrderProductDto;
import com.rhiodamuthie.sbapirestful.model.Order;
import com.rhiodamuthie.sbapirestful.model.OrderProduct;
import com.rhiodamuthie.sbapirestful.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class OrderRestController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody OrderForm form) {
        List<OrderProductDto> formDtos = form.getProductOrders();
        validateProductsExistence(formDtos);
        // create order logic
        // populate order with products

        Order order = new Order();
        @Valid List<OrderProduct> orderProducts = new ArrayList<>();
        order.setOrderProducts(orderProducts);
        this.orderService.update(order);

        String uri = ServletUriComponentsBuilder
                .fromCurrentServletMapping()
                .path("/orders/{id}")
                .buildAndExpand(order.getId())
                .toString();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", uri);

        return new ResponseEntity<>(order, headers, HttpStatus.CREATED);
    }

    private void validateProductsExistence(List<OrderProductDto> formDtos) {
    }

}
