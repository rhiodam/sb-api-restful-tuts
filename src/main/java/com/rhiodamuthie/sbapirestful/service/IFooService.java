package com.rhiodamuthie.sbapirestful.service;

import com.rhiodamuthie.sbapirestful.model.Foo;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface IFooService {
    List<Foo> findAll();

    Object findById(Long id);

    Long create(Foo resource);

    Object getById(Long id);

    void update(Foo resource);

    void deleteById(Long id);
}
