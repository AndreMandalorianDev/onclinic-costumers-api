package com.onclinic.costumers.api.services.interfaces;

import com.onclinic.costumers.api.domain.dtos.AddressDTO;
import com.onclinic.costumers.api.domain.models.Address;

public interface IAdressService {
    Address addAddress(AddressDTO addressDTO);

    Address getAddressById(String addressId);
}
