package com.loopcodes.gereciamentoecommerce.Repository;

import com.loopcodes.gereciamentoecommerce.Entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
