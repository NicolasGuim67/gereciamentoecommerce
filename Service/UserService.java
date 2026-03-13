package com.loopcodes.gereciamentoecommerce.Service;


import com.loopcodes.gereciamentoecommerce.Entitys.User;
import com.loopcodes.gereciamentoecommerce.Repository.UserRepository;
import com.loopcodes.gereciamentoecommerce.dto.response.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO gfindByIdDTO(Long Id) {
        User user = userRepository.findById(Id).orElse(null);
        return convertToDTO(user);
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public void saveUser(UserDTO userDTO) {
        User user = convertToEntity(userDTO);
        userRepository.save(user);
    }

    private UserDTO convertToDTO(User user) {
        return null;
    }

    private User convertToEntity(UserDTO userDTO) {

        return null;
    }



    public List<User> findAll(){return userRepository.findAll();}

    public User findById(Long id){
        return userRepository.findById(id)


                .orElseThrow(()-> new RuntimeException("User not finded"));
    }
    public User update(Long id, User userDetails){
        User user = findById((id));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        user.setCpf(userDetails.getCpf());
        user.setPassword(userDetails.getPassword());


        return userRepository.save(user);
    }
    public void delete(Long id){userRepository.deleteById(id);}
}
