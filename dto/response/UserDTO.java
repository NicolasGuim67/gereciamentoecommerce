package com.loopcodes.gereciamentoecommerce.dto.response;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;

@Builder
@JsonPropertyOrder({ "name", "email", "cpf" })
public record UserDTO(
        String name,
        String email,
        Integer cpf
) {
}
