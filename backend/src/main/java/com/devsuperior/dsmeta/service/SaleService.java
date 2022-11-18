package com.devsuperior.dsmeta.service;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
}
