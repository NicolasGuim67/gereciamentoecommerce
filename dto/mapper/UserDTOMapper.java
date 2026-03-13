package com.loopcodes.gereciamentoecommerce.dto.mapper;

import com.loopcodes.gereciamentoecommerce.Entitys.User;
import com.loopcodes.gereciamentoecommerce.dto.response.UserDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class  UserDTOMapper implements Function<User, UserDTO> {
    @Override
    public UserDTO apply(User user) {
        return new UserDTO(user.getName(),
                user.getEmail(),
                user.getCpf());
    }
}
