package com.wallet.walletManagement.repository;

import com.wallet.walletManagement.model.Transcation; // 현재 파일명이 Transcation이라 맞춰줌
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface TrasactionRepository {
    List<Transcation> findAll();
    Transcation findById(@Param("id") Long id);
    List<Transcation> findByAccountId(@Param("accountId") Long accountId);
    List<Transcation> findByDateRange(@Param("start") LocalDateTime start,
                                      @Param("end") LocalDateTime end);

    void insert(Transcation transcation);
    void update(Transcation transcation);
    void delete(@Param("id") Long id);
}
