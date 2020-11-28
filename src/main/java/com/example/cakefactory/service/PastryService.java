package com.example.cakefactory.service;

import com.example.cakefactory.entity.Pastry;
import com.example.cakefactory.repository.PastryRepository;
import org.springframework.stereotype.Service;

@Service
public class PastryService {

    private final PastryRepository pastryRepository;

    public PastryService(PastryRepository pastryRepository) {
        this.pastryRepository = pastryRepository;
    }

    public Iterable<Pastry> findAll() {
        return pastryRepository.findAll();
    }
}
