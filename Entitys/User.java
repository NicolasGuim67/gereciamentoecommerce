package com.loopcodes.gereciamentoecommerce.Entitys;

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

    private Long id;
    private String name;
    private String email;
    private Integer password;
    private Integer cpf;


    }

