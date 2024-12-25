package com.ecommerce.project.repository;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String categoryName);
    // we don't need to write the code for this, spring data jpa will create it at run time
}
