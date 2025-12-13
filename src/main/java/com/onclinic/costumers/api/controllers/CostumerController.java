package com.onclinic.costumers.api.controllers;

import com.onclinic.costumers.api.domain.dtos.CostumerDTO;
import com.onclinic.costumers.api.domain.models.Costumer;
import com.onclinic.costumers.api.http.responses.Response;
import com.onclinic.costumers.api.services.interfaces.IConstumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/onclinic-costumers-api/costumers")
public class CostumerController {

    private final Logger logger = LoggerFactory.getLogger(CostumerController.class);

    @Autowired
    private IConstumerService service;

    @PostMapping
    public ResponseEntity<Response> addConstumer(@RequestBody CostumerDTO costumerDTO){
        try {
            Costumer costumer = service.addCostumer(costumerDTO);
            Response response = new Response("Success on adding new Costumer", costumer, 201);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch (Exception ex){
            logger.error("CostumerController - Error on adding a new Costumer: {}", ex.getMessage());
            Response response = new Response("Error on adding a new Costumer: " + ex.getMessage(), null, 500);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
