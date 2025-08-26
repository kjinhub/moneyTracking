package com.wallet.walletManagement.repository;

import com.wallet.walletManagement.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRepository {
    List<User> findAll();
    User findById(@Param("id") Long id);
    User findByUsername(@Param("username") String username);

    void insert(User user);
    void update(User user);
    void delete(@Param("id") Long id);
}
