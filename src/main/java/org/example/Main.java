package org.example;

import org.example.config.Vkconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;

import java.util.Date;

public class Main {
    public static int cid = 1;
    public static int uid = 1;
    public static int lid = 1;
    public static int mid = 1;
    public static int qid = 1;
    public static int imid = 1;

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Vkconfig.class);
        Users user = context.getBean("damir", Users.class);
        System.out.println(user);
        UsersPost usersPost = context.getBean("userpost", UsersPost.class);
        System.out.println(usersPost);
        UsersPost usersPost2 = context.getBean("userpost2", UsersPost.class);
        System.out.println(usersPost2);
        Message message = context.getBean(Message.class);
        System.out.println(message);
        Images img = context.getBean(Images.class);
        System.out.println(img);

//        ctx.getBean(damir).showMeAllPosts()
        Users damir = context.getBean("damir", Users.class);
        damir.showMeAllPosts();
    }
}