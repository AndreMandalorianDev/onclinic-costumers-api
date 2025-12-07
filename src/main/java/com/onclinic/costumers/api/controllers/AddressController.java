package com.onclinic.costumers.api.controllers;

import com.onclinic.costumers.api.domain.dtos.AddressDTO;
import com.onclinic.costumers.api.domain.models.Address;
import com.onclinic.costumers.api.services.interfaces.IAdressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/onclinic-costumers-api/addresses")
@CrossOrigin
public class AddressController {

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private IAdressService _addressService;

    @PostMapping
    public ResponseEntity<String> addAddress(@RequestBody AddressDTO addressDTO){
        logger.info("AddressController - Adding a new address...");

        try {
            Address address =  _addressService.addAddress(addressDTO);
            logger.info("AddressController - Success on add new address: {}", address.getAdressId());
            return new ResponseEntity<String>("Success on add new Address: " + address.getAdressId(), HttpStatus.CREATED);
        }catch (Exception ex){
            logger.error("AddressController - Error on add a new Address: {}", ex.getMessage());
            return new ResponseEntity<String>("Error on add a new Address: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
