package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.*;
import org.example.aspect.MyLogger;
import org.example.entity.*;
import org.example.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class Home {
    private final UsersService usersService;
    private final UsersPostService usersPostService;
    private final MessageService messageService;
    private final LikesService likesService;
    private final CategoriesServise categoriesServise;
    private final ImagesService imagesService;
    @MyLogger
    @PostMapping("/users")
    public String sendUsers(@RequestBody UsersDto usersDto){
        return usersService.addUsers(usersDto);
    }
    @MyLogger
    @PostMapping("/usersposts")
    public String sendUsersPost(@RequestBody UsersPostDto postDto){
        return usersPostService.addUsersPost(postDto);
    }
    @MyLogger
    @PostMapping("/messsage")
    public String sendMessage(@RequestBody MessageDto messageDto){
        return messageService.addMessage(messageDto);
    }
    @MyLogger
    @PostMapping("/like")
    public String sendLike(@RequestBody LikeDto likeDto){
        return likesService.addLike(likeDto);
    }
    @MyLogger
    @PostMapping("/createCategory")
    public String sendCategory(@RequestBody CategoriesDto categoriesDto){
        return categoriesServise.addCategory(categoriesDto);
    }
    @PostMapping("/images")
    public String sendImages(@RequestBody ImagesDto imagesDto){
        return imagesService.addImages(imagesDto);
    }
    @MyLogger
    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }
    @GetMapping("/userspost")
    public List<UsersPost> getAllUsersPost(){
        return usersPostService.getAllUsersPost();
    }
    @MyLogger
    @GetMapping("/message")
    public List<Message> getAllMessage(){
        return messageService.getAllMessage();
    }
    @MyLogger
    @GetMapping("/like")
    public List<Likes> getAllLikes(){
        return likesService.getAllLikes();
    }
    @MyLogger
    @GetMapping("/images")
    public List<Images> getAllImages(){
        return imagesService.getAllImages();
    }

}
