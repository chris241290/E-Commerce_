package com.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

	Page<Product> findByProductNameLike(String keyword, Pageable pageDetails);

}
