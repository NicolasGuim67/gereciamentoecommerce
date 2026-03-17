package com.loopcodes.gereciamentoecommerce.Entitys;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.loopcodes.gereciamentoecommerce.dto.response.UserDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Optional;


@Entity
@Table(name = "users")
@Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonPropertyOrder({ "name", "email", "password", "cpf" })
    private Long id;
    private String name;
    private String email;
    private Integer password;
    private Integer cpf;


    }

