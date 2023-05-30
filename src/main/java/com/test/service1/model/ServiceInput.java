package com.test.service1.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "service_input")
public class ServiceInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String serviceName;

    private String serviceInput;
}
