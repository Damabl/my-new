package org.example.repository;

import org.example.entity.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagesRepository extends JpaRepository<Images,Long> {
    @Override
    List<Images> findAll();
}
