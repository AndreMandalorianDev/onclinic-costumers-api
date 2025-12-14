package com.onclinic.costumers.api.repositories;

import com.onclinic.costumers.api.domain.models.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICostumerRepository extends JpaRepository<Costumer, String> {
}
