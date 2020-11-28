package com.example.cakefactory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pastry {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;
}
