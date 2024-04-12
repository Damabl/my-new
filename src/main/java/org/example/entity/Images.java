package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.example.entity.Users;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Images {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Users user;
    @Column(name="img")
    private String img;
}
