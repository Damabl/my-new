package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Users {
    private int id;
    private String gmail;
    private String firstname;
    private String lastname;
    private String avatar;
    private boolean gender;
    private String date;
    private List<UsersPost> listofPost=new ArrayList<>();
    public Users(){
    }

    public Users(int id, String gmail, String firstname, String lastname, String avatar, boolean gender, String date) {
        this.id = id;
        this.gmail = gmail;
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatar = avatar;
        this.gender = gender;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void showMeAllPosts(){
        for(UsersPost posts : listofPost){
            System.out.println(posts);
        }
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
