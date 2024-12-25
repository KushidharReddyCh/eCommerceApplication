package com.ecommerce.project.repository;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.model.Product;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryOrderByPriceAsc(Category category);

    List<Product> findByProductNameLikeIgnoreCase(String keyword);

    Product findByProductName(@Size(min = 3, message = "must contain at-least 3 characters") String productName);
}
