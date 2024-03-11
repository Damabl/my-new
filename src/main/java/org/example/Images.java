package org.example;

import org.example.entity.Users;

public class Images {
    private int id;
    private Users userId;
    private String img;

    public Images(int id, Users userId, String img) {
        this.id = id;
        this.userId = userId;
        this.img = img;
    }

    public Images() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Images{" +
                "id=" + id +
                ", userId=" + userId +
                ", img='" + img + '\'' +
                '}';
    }
}
