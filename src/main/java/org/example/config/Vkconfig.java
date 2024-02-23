package org.example.config;

import org.example.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.example.Main.cid;
import static org.example.Main.uid;
import static org.example.Main.mid;
import static org.example.Main.lid;
import static org.example.Main.qid;
import static org.example.Main.imid;

@Configuration
public class Vkconfig {

    @Bean
    @Scope("prototype")
    String date() {
        Calendar calendar = new GregorianCalendar(2005, 05, 18);
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(date);
    }

    @Bean
    @Scope("prototype")
    String date2() {
        Calendar calendar = new GregorianCalendar(2002, 11, 8);
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(date);
    }

    @Bean
    String dateofNow() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    @Bean(name = "damir")
    @Scope("singleton")
    Users user() {
        var user = new Users();
        user.setId(uid++);
        user.setAvatar("url.jpg");
        user.setFirstname("Damir");
        user.setLastname("Ablahat");
        user.setGmail("damir@gmail.com");
        user.setGender(true);
        user.setDate(date());
        return user;
    }

    @Bean(name = "beibarys")
    @Scope("singleton")
    Users user2() {
        var user = new Users();
        user.setId(uid++);
        user.setAvatar("url.jpg");
        user.setFirstname("Beybarys");
        user.setLastname("Manap");
        user.setGmail("beybarys@gmail.com");
        user.setGender(true);
        user.setDate(date2());
        return user;
    }
    @Bean(name = "Barys")
    @Scope("singleton")
    Users user4() {
        var user = new Users();
        user.setId(uid++);
        user.setAvatar("url.jpg");
        user.setFirstname("Beybarys");
        user.setLastname("Manap");
        user.setGmail("beybarys@gmail.com");
        user.setGender(true);
        user.setDate(date2());
        return user;
    }

    @Bean
    @Scope("singleton")
    Categories category() {
        Categories category = Categories.SPORT;
        return category;
    }

    @Bean
    @Scope("prototype")
    UsersPost userpost() {
        var userpost = new UsersPost();
        userpost.setId(cid++);
        userpost.setTitle("Sport");
        userpost.setUserId(user());
        userpost.setContent("GGG lost the fight Albares");
        userpost.setCategory(category());
        userpost.setImage("url.jpg");
        userpost.setCreateAt(dateofNow());
        return userpost;
    }

    @Bean
    @Scope("prototype")
    UsersPost userpost2() {
        var userpost = new UsersPost();
        userpost.setId(cid++);
        userpost.setTitle("Sport");
        userpost.setUserId(user());
        userpost.setContent("GGG lost the fight Albares");
        userpost.setCategory(category());
        userpost.setImage("url.jpg");
        userpost.setCreateAt(dateofNow());
        return userpost;
    }

    @Bean
    @Scope("prototype")
    Message message() {
        Message message = new Message();
        message.setId(mid++);
        message.setSenderId(user());
        message.setRecipientId(user2());
        message.setMessage("Hello my friend");
        message.setTimeofSend(dateofNow());
        return message;
    }

    @Bean
    @Scope("prototype")
    Images img() {
        Images img = new Images();
        img.setId(imid);
        img.setUserId(user());
        img.setImg("url.jpg");
        return img;
    }

    @Bean
    @Scope("prototype")
    Likes like() {
        Likes like = new Likes();
        like.setId(lid++);
        like.setPostId(userpost());
        like.setUserId(user());
        return like;
    }

    @Bean
    @Scope("prototype")
    Likes like2() {
        Likes like = new Likes();
        like.setId(lid++);
        like.setPostId(userpost());
        like.setUserId(user2());
        return like;
    }

    @Bean
    @Scope("prototype")
    Friends isfriend() {
        Friends friend = new Friends();
        friend.setId(qid++);
        friend.setUserSender(user());
        friend.setUserRecipient(user2());
        friend.setFriend(false);
        return friend;
    }


}
