package com.onclinic.costumers.api.repositories;

import com.onclinic.costumers.api.domain.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, String> {
}
