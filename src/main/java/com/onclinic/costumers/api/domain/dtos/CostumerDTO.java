package com.onclinic.costumers.api.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CostumerDTO {
    private String costumerId;
    private String fullName;
    private String phoneNumber;
    private Date birthDate;
    private AddressDTO address;
}
