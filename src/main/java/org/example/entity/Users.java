package org.example.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="gmail")
    private String gmail;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="avatar")
    private String avatar;
    @Column(name="gender")
    private boolean gender;
    @Column(name="date")
    private String date;
    @OneToMany(mappedBy = "user")
    private List<UsersPost> listofPost;
    @Column(name="password")
    private String password;

}
