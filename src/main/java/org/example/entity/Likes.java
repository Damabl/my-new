package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.entity.Users;
import org.example.entity.UsersPost;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Likes {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="user_id")
    private Users user;
    @ManyToOne
    @JoinColumn(name="post_id")
    private UsersPost post;


}
