package org.example.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.example.Categories;
import org.example.entity.Users;

@Entity
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
    private Categories category;

   @ManyToOne
   @JsonIgnore
   @JoinColumn(name="user_id")
    private Users user;
    @Column(name="createAt")
    private String createAt;

    public UsersPost(String title, String content, String image, Categories category, Users userId, String createAt) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.category = category;
        this.user = userId;
        this.createAt = createAt;
    }
    public UsersPost(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public Users getUserId() {
        return user;
    }

    public void setUserId(Users user) {
        this.user = user;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "UsersPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", category=" + category +
                ", userId=" + user +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}
