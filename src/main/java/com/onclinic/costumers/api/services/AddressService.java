package com.onclinic.costumers.api.services;

import com.onclinic.costumers.api.domain.dtos.AddressDTO;
import com.onclinic.costumers.api.domain.models.Address;
import com.onclinic.costumers.api.repositories.IAddressRepository;
import com.onclinic.costumers.api.services.interfaces.IAdressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAdressService {

    private static final Logger logger = LoggerFactory.getLogger(AddressService.class);

    @Autowired
    private IAddressRepository _repository;

    public Address addAddress(AddressDTO addressDTO) {
        logger.info("AddressService - Adding a new Address...");
        try{
            Address address = new Address();
            address.setStreet(addressDTO.getStreet());
            address.setNumber(addressDTO.getNumber());
            address.setZipCode(addressDTO.getZipCode());
            address.setComplement(addressDTO.getComplement());
            address = _repository.save(address);

            logger.info("AddressService - Success on save the address: {}", address.getAdressId());
            return address;
        }catch (Exception ex){
            logger.error("AddressService - Error when add a new Address: {}", ex.getMessage());
            throw ex;
        }

    }

    public Address getAddressById(String addressId) {
        return null;
    }
}
