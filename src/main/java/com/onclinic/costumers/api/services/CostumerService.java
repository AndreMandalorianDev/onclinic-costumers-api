package com.onclinic.costumers.api.services;

import com.onclinic.costumers.api.domain.dtos.CostumerDTO;
import com.onclinic.costumers.api.domain.models.Costumer;
import com.onclinic.costumers.api.repositories.ICostumerRepository;
import com.onclinic.costumers.api.services.interfaces.IConstumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerService implements IConstumerService {

    @Autowired
    private ICostumerRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(CostumerService.class);

    public Costumer addCostumer(CostumerDTO costumerDTO) {
        try {
            logger.info("ConstumerService - Adding a new costumer...");

            Costumer costumer = new Costumer();
            costumer.setCostumerId(costumerDTO.getCostumerId());
            costumer.setFullName(costumerDTO.getFullName());
            costumer.setPhoneNumber(costumerDTO.getPhoneNumber());
            costumer.setBirthDate(costumerDTO.getBirthDate());
            costumer = repository.save(costumer);

            return costumer;
        }catch (Exception ex){
            logger.error("ConstumerService - Error when add a new Address: {}", ex.getMessage());
            throw ex;
        }
    }
}
