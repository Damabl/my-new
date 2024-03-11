package org.example;

import org.example.entity.Users;
import org.example.entity.UsersPost;

public class Likes {
    private int id;
    private UsersPost postId;
    private Users userId;
    public Likes(int id, UsersPost postId, Users userId) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
    }
    public Likes(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersPost getPostId() {
        return postId;
    }

    public void setPostId(UsersPost postId) {
        this.postId = postId;
//        postId.getUsersLikes().add();
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }
}
