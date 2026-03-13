package com.loopcodes.gereciamentoecommerce.dto.response;


import lombok.Builder;

@Builder
public record UserDTO(
        String name,
        String email,
        Integer cpf
) {
}
