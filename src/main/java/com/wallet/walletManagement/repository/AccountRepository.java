package com.wallet.walletManagement.repository;

import com.wallet.walletManagement.model.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccountRepository {
    List<Account> findAll();
    Account findById(@Param("id") Long id);
    void insert(Account account);
    void update(Account account);
    void delete(@Param("id") Long id);
}
