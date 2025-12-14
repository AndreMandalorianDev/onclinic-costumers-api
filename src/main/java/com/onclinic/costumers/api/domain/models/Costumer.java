package com.onclinic.costumers.api.domain.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "costumer")
public class Costumer {
    @Id
    @Column(name = "costumer_id", nullable = false, unique = true, columnDefinition = "VARCHAR(11)")
    private String costumerId;

    @Column(name = "full_name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String fullName;

    @Column(name = "phone_number", nullable = false, columnDefinition = "VARCHAR(15)")
    private String phoneNumber;

    @Column(name = "birth_date", columnDefinition = "DATE")
    private Date birthDate;

    @OneToMany
    private ArrayList<Address> addresses;

}
