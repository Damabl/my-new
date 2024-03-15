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
@Table(name="UsersPost")
public class UsersPost {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="content")
    private String content;
    @Column(name="image")
    private String image;
    @Column(name="category")
    private String category;

   @ManyToOne
   @JsonIgnore
   @JoinColumn(name="user_id")
    private Users user;
    @Column(name="createAt")
    private LocalDateTime createAt;

}
