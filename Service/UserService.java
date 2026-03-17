package com.loopcodes.gereciamentoecommerce.Service;


import com.loopcodes.gereciamentoecommerce.Entitys.User;
import com.loopcodes.gereciamentoecommerce.Repository.UserRepository;
import com.loopcodes.gereciamentoecommerce.dto.mapper.UserDTOMapper;
import com.loopcodes.gereciamentoecommerce.dto.response.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDTOMapper userDTOMapper;

    public UserDTO gfindByIdDTO(Long Id) {
       // User user = userRepository.findById(Id).orElse(null);
        return userRepository.findById(Id)
                .map(userDTOMapper)
                .orElseThrow(()->new RuntimeException("User not found with the Id:" + Id));
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

    private UserDTO convertToEntity(User user) {
        if(user==null)
        return null;
        return userDTOMapper.apply(user);
    }
    private User convertToEntity(UserDTO userDTO){
     if(userDTO==null)return null;

     User user = new User();
     user.setName(userDTO.name());
     user.setEmail(userDTO.email());
     user.setCpf(userDTO.cpf());
     return user;
    }

    public List<UserDTO> findAllDTO(){
        return userRepository.findAll()
                .stream()
                .map(userDTOMapper)
                .collect(Collectors.toList());}

    public List<User> findAll(){
        return userRepository.findAll();
    }

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
