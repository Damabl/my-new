package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.UsersPostDto;
import org.example.entity.UsersPost;
import org.example.repository.UsersPostRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersPostService {
    private final UsersPostRepository usersPostRepository;
    private final UsersService usersService;
    private final CategoriesServise categoriesServise;

    public String addUsersPost(UsersPostDto post){
        UsersPost usersPost=new UsersPost();
        if (post.getTitle() == null || post.getTitle().isEmpty()) {
            return "Title cannot be empty";
        }else{
            usersPost.setTitle(post.getTitle());
        }
        if (post.getContent() == null || post.getContent().isEmpty()) {
            return "Content cannot be empty";
        }else{
            usersPost.setContent(post.getContent());
        }
        try {
            usersPost.setImage(post.getImage());
            usersPost.setCategory(categoriesServise.getCategoryById(post.getCategory()));
            usersPost.setUser(usersService.getUserById(post.getUser()));
            usersPost.setCreatedAt(LocalDateTime.now());
            usersPostRepository.save(usersPost);
        }catch (ChangeSetPersister.NotFoundException ex){
            return "NotFoundExpection";
        }
        return "Added";
    }
    public UsersPost getPostById(Long id){
        return usersPostRepository.getById(id);
    }
    public String updateUsersPost(UsersPostDto updatedPostDto,Long id){
        UsersPost existingPost = usersPostRepository.getById(id);
        if (existingPost == null) {
            return "There isnt this post";
        }
     try{
        // Map updated fields from updatedPostDto to existingPost
        existingPost.setTitle(updatedPostDto.getTitle());
        existingPost.setContent(updatedPostDto.getContent());
        existingPost.setImage(updatedPostDto.getImage());
        existingPost.setCategory(categoriesServise.getCategoryById(updatedPostDto.getCategory()));
        UsersPost updatedPost = usersPostRepository.save(existingPost);
    }catch (ChangeSetPersister.NotFoundException ex){
        return "NotFoundExpection";
    }
        return "Users post updated successfully";
    }

    public String deleteUsersPost(Long id){
        usersPostRepository.deleteById(id);
        return "deleted";
    }
    public List<UsersPost> getAllUsersPost(){
        return usersPostRepository.findAll();
    }


}
