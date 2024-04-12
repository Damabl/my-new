package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users_post")
public class UsersPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", columnDefinition = "VARCHAR(255)") // Example JDBC type specification
    private String title;

    @Column(name = "content", columnDefinition = "TEXT") // Example JDBC type specification
    private String content;

    @Column(name = "image", columnDefinition = "TEXT") // Example JDBC type specification
    private String image;
    @ManyToOne
    @JoinColumn(name = "category")
    private Categories category;

    @Column(name = "createdAt", columnDefinition = "TIMESTAMP") // Example JDBC type specification
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    // Corrected field name to match column name in the database
}
