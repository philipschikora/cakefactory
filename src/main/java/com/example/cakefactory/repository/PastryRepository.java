package com.example.cakefactory.repository;

import com.example.cakefactory.entity.Pastry;
import org.springframework.data.repository.CrudRepository;

public interface PastryRepository extends CrudRepository<Pastry, Integer> {
}
