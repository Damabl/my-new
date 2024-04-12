package org.example.repository;

import org.example.entity.UsersPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersPostRepository extends JpaRepository<UsersPost,Long> {
    UsersPost getById(Long id);
    void deleteById(Long id);
}
