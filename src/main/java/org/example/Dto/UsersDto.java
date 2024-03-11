package org.example.Dto;

import org.example.entity.UsersPost;

import java.util.List;

public class UsersDto {
        private Long id;

        private String gmail;

        private String firstname;

        private String lastname;

        private String avatar;

        private boolean gender;

        private String date;
        private String password;
        public UsersDto(){
        }

        public UsersDto(Long id, String gmail, String firstname, String lastname, String avatar, boolean gender, String date, String password) {
            this.id = id;
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
