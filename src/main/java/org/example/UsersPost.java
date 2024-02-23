package org.example;
import java.util.ArrayList;
import java.util.List;

public class UsersPost {
    private int id;
    private String title;
    private String content;
    private String image;
    private Categories category;
    private Users userId;
    private String createAt;

    public UsersPost(String title, String content, String image, Categories category, Users userId, String createAt) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.category = category;
        this.userId = userId;
        this.createAt = createAt;
    }
    public UsersPost(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return userId;
    }

    public void setUserId(Users user) {
        this.userId = user;
        user.getListofPost().add(this);
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
                ", userId=" + userId +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}
