package com.onclinic.costumers.api.services.interfaces;

import com.onclinic.costumers.api.domain.dtos.CostumerDTO;
import com.onclinic.costumers.api.domain.models.Costumer;

public interface IConstumerService {

    Costumer addCostumer(CostumerDTO costumerDTO);
}
