package org.example;

import org.example.entity.Users;

public class Message {
    private int id;
    private Users senderId;
    private Users recipientId;
    private String message;
    private String timeofSend;

    public Message(int id, Users senderId, Users recipientId, String message, String timeofSend) {
        this.id = id;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.message = message;
        this.timeofSend = timeofSend;
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getSenderId() {
        return senderId;
    }

    public void setSenderId(Users senderId) {
        this.senderId = senderId;
    }

    public Users getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Users recipientId) {
        this.recipientId = recipientId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeofSend() {
        return timeofSend;
    }

    public void setTimeofSend(String timeofSend) {
        this.timeofSend = timeofSend;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", senderId=" + senderId +
                ", recipientId=" + recipientId +
                ", message='" + message + '\'' +
                ", timeofSend='" + timeofSend + '\'' +
                '}';
    }
}
