package com.caovinh.identity_service.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.caovinh.identity_service.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
