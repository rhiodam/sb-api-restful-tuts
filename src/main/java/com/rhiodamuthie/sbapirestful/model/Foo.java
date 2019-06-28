package com.rhiodamuthie.sbapirestful.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Foo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String text;
}
