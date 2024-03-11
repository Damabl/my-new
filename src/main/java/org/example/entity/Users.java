package org.example.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
@Entity
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
    public Users(){
    }

    public Users( String gmail, String firstname, String lastname, String avatar, boolean gender, String date,String password) {
        this.gmail = gmail;
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatar = avatar;
        this.gender = gender;
        this.date = date;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<UsersPost> getListofPost() {
        return listofPost;
    }

    public void setListofPost(List<UsersPost> listofPost) {
        this.listofPost = listofPost;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", gmail='" + gmail + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", date='" + date + '\'' +
                '}';
    }
}
