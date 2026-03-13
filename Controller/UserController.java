package com.loopcodes.gereciamentoecommerce.Controller;


import com.loopcodes.gereciamentoecommerce.Entitys.Product;
import com.loopcodes.gereciamentoecommerce.Entitys.User;
import com.loopcodes.gereciamentoecommerce.Service.UserService;
import com.loopcodes.gereciamentoecommerce.dto.response.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{id}")
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }
    @GetMapping
    public List<User> getAllProduct(){return userService.findAll();}

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.findById(id);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User userDetails){
        return userService.update(id,userDetails);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);
    }


}
