package com.example.LT_Nhom9_Java_Buoi7.repository;

import com.example.LT_Nhom9_Java_Buoi7.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}