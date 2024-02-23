package org.example;

public class Friends {
    private int id;
    private Users userSender;
    private Users userRecipient;
    private boolean friend;

    public Friends(int id, Users userSender, Users userRecipient, boolean friend) {
        this.id = id;
        this.userSender = userSender;
        this.userRecipient = userRecipient;
        this.friend = friend;
    }
    public Friends(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUserSender() {
        return userSender;
    }

    public void setUserSender(Users userSender) {
        this.userSender = userSender;
    }

    public Users getUserRecipient() {
        return userRecipient;
    }

    public void setUserRecipient(Users userRecipient) {
        this.userRecipient = userRecipient;
    }

    public boolean isFriend() {
        return friend;
    }

    public void setFriend(boolean friend) {
        this.friend = friend;
    }
}
