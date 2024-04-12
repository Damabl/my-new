package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.security.PrivateKey;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categories {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="categories")
    private String category;
    @OneToMany(mappedBy = "category")
    private List<UsersPost> usersPostList;
}
