package com.onclinic.costumers.api.domain.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "address_id", nullable = false, unique = true, columnDefinition = "VARCHAR(32)")
    private String adressId;

    @Column(name = "zip_code",  nullable = false, columnDefinition = "VARCHAR(8)")
    private String zipCode;

    @Column(name = "street",  nullable = false, columnDefinition = "VARCHAR(200)")
    private String street;

    @Column(name = "number",  nullable = false, columnDefinition = "VARCHAR(5)")
    private String number;

    @Column(name = "complement", nullable = true, columnDefinition = "VARCHAR(10)")
    private String complement;
}
