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
@CrossOrigin("*")
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
    @PostMapping("/message")
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

    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }
    @GetMapping("/userspost")
    public List<UsersPost> getAllUsersPost(){
        return usersPostService.getAllUsersPost();
    }

    @GetMapping("/message")
    public List<Message> getAllMessage(){
        return messageService.getAllMessage();
    }
    @PutMapping("/usersposts/{id}")
    public String updateUsersPost(@PathVariable Long id, @RequestBody UsersPostDto updatedPostDto) {
        return usersPostService.updateUsersPost(updatedPostDto,id);
    }
    @DeleteMapping("/usersposts/{id}")
    public String deleteUsersPost(@PathVariable Long id){
        return usersPostService.deleteUsersPost(id);
    }
    @GetMapping("/like")
    public List<Likes> getAllLikes(){
        return likesService.getAllLikes();
    }

    @GetMapping("/images")
    public List<Images> getAllImages(){
        return imagesService.getAllImages();
    }
    @GetMapping("/category")
    public List<Categories> getAllCategories(){
        return categoriesServise.getAllCategories();
    }
}
