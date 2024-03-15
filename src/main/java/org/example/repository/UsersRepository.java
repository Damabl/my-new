package org.example.repository;

import org.example.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
    Users getByGmail(String gmail);
    Users getById(Long id);
    List<Users> findAll();
}
