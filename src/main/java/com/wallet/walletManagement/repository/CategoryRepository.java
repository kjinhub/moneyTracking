package com.wallet.walletManagement.repository;

import com.wallet.walletManagement.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryRepository {
    List<Category> findAll();
    Category findById(@Param("id") Long id);
    List<Category> findByType(@Param("type") String type);

    void insert(Category category);
    void update(Category category);
    void delete(@Param("id") Long id);
}
