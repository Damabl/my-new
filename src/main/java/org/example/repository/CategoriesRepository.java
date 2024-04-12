package org.example.repository;

import org.example.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Long> {
    List<Categories> findAll();
    Optional<Categories> findById(Long id);
    Optional<Categories> findByCategory(String name);
}
